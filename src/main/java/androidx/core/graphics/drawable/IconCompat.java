package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A09 = PorterDuff.Mode.SRC_IN;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;
    public ColorStateList A03 = null;
    public PorterDuff.Mode A04 = A09;
    public Parcelable A05 = null;
    public Object A06;
    public String A07 = null;
    public byte[] A08 = null;

    public IconCompat() {
    }

    public IconCompat(int i) {
        this.A02 = i;
    }

    public static Resources A00(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    public static Bitmap A01(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) >> 1), (float) ((-(bitmap.getHeight() - min)) >> 1));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat A02(Context context, int i) {
        if (context != null) {
            return A03(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static IconCompat A03(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.A00 = i;
            if (resources != null) {
                try {
                    iconCompat.A06 = resources.getResourceName(i);
                    return iconCompat;
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.A06 = str;
                return iconCompat;
            }
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public int A04() {
        int i;
        int i2 = this.A02;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.A06;
            if (i >= 28) {
                return icon.getResId();
            }
            try {
                return ((Number) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        } else if (i2 == 2) {
            return this.A00;
        } else {
            StringBuilder sb = new StringBuilder("called getResId() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public int A05() {
        int i;
        int i2 = this.A02;
        if (i2 != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            return i2;
        }
        Icon icon = (Icon) this.A06;
        if (i >= 28) {
            return icon.getType();
        }
        try {
            return ((Number) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to get icon type ");
            sb2.append(icon);
            Log.e("IconCompat", sb2.toString(), e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to get icon type ");
            sb3.append(icon);
            Log.e("IconCompat", sb3.toString(), e3);
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A06(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.A06(android.content.Context):android.graphics.drawable.Drawable");
    }

    public Icon A07() {
        Icon createWithBitmap;
        int i = this.A02;
        if (i == -1) {
            return (Icon) this.A06;
        }
        if (i == 1) {
            createWithBitmap = Icon.createWithBitmap((Bitmap) this.A06);
        } else if (i == 2) {
            createWithBitmap = Icon.createWithResource(A08(), this.A00);
        } else if (i == 3) {
            createWithBitmap = Icon.createWithData((byte[]) this.A06, this.A00, this.A01);
        } else if (i == 4) {
            createWithBitmap = Icon.createWithContentUri((String) this.A06);
        } else if (i != 5) {
            throw new IllegalArgumentException("Unknown type");
        } else if (Build.VERSION.SDK_INT >= 26) {
            createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.A06);
        } else {
            createWithBitmap = Icon.createWithBitmap(A01((Bitmap) this.A06, false));
        }
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A09) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String A08() {
        int i;
        int i2 = this.A02;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.A06;
            if (i >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        } else if (i2 == 2) {
            return ((String) this.A06).split(":", -1)[0];
        } else {
            StringBuilder sb = new StringBuilder("called getResPackage() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void A09(Context context) {
        if (this.A02 == 2) {
            String str = (String) this.A06;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                int identifier = A00(context, str5).getIdentifier(str4, str3, str5);
                if (this.A00 != identifier) {
                    StringBuilder sb = new StringBuilder("Id has changed for ");
                    sb.append(str5);
                    sb.append("/");
                    sb.append(str4);
                    Log.i("IconCompat", sb.toString());
                    this.A00 = identifier;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r7 != 5) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
