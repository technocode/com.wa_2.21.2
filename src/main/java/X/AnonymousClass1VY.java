package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import com.google.android.search.verification.client.R;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaper;
import com.whatsapp.settings.chat.wallpaper.ResetWallpaper;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;
import com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.1VY  reason: invalid class name */
public class AnonymousClass1VY {
    public static int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 107348) {
                return (hashCode != 3202466 || !str.equals("high")) ? 0 : 3;
            }
            if (str.equals("low")) {
                return 2;
            }
        } else if (str.equals("unknown")) {
            return 1;
        }
    }

    public static Drawable A01(Context context, int i, boolean z) {
        int[] intArray;
        if (z) {
            intArray = context.getResources().getIntArray(R.array.solid_color_wallpaperv2_colors);
        } else {
            intArray = context.getResources().getIntArray(R.array.solid_color_wallpaper_colors);
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.setPixel(0, 0, intArray[i]);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r2 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A02(android.content.Context r3, android.content.res.Resources r4, X.C002701k r5) {
        /*
            android.graphics.Point r1 = X.AnonymousClass02J.A00(r3)
            r3 = 0
            r0 = 2131231177(0x7f0801c9, float:1.8078428E38)
            java.io.InputStream r2 = r4.openRawResource(r0)     // Catch:{ IOException -> 0x0026 }
            r0 = 1
            X.02K r0 = X.AnonymousClass02J.A01(r1, r0, r5)     // Catch:{ all -> 0x001d }
            X.02L r0 = X.C002001d.A0o(r2, r0)     // Catch:{ all -> 0x001d }
            android.graphics.Bitmap r1 = r0.A02     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x002e
            r2.close()
            goto L_0x002e
        L_0x001d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0025
            r2.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        L_0x0026:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/exception"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = r3
        L_0x002e:
            if (r1 == 0) goto L_0x003a
            r0 = 0
            r1.setDensity(r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r4, r1)
            return r0
        L_0x003a:
            java.lang.String r0 = "wallpaper/cannot decode default wallpaper"
            com.whatsapp.util.Log.w(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VY.A02(android.content.Context, android.content.res.Resources, X.01k):android.graphics.drawable.Drawable");
    }

    public static Drawable A03(AnonymousClass02M r9, Context context, int i, int i2, int i3) {
        Throwable e;
        Drawable drawable = null;
        try {
            Drawable drawable2 = context.getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper").getDrawable(i);
            try {
                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                if (bitmap == null) {
                    bitmap = null;
                } else {
                    float f = (float) i2;
                    float height = ((float) bitmap.getHeight()) / ((float) i3);
                    if (((float) bitmap.getWidth()) / f > height) {
                        int width = (int) (((float) bitmap.getWidth()) / height);
                        if (width > 0 && i3 > 0 && i2 > 0) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, i3, true);
                            bitmap = Bitmap.createBitmap(createScaledBitmap, (createScaledBitmap.getWidth() - i2) >> 1, 0, i2, i3);
                            if (bitmap != createScaledBitmap) {
                                createScaledBitmap.recycle();
                            }
                        }
                    } else {
                        int height2 = (int) ((((float) bitmap.getHeight()) * f) / ((float) bitmap.getWidth()));
                        if (height2 > 0 && i3 > 0 && i2 > 0) {
                            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, i2, height2, true);
                            bitmap = Bitmap.createBitmap(createScaledBitmap2, 0, (createScaledBitmap2.getHeight() - i3) >> 1, i2, i3);
                            if (bitmap != createScaledBitmap2) {
                                createScaledBitmap2.recycle();
                            }
                        }
                    }
                }
                if (bitmap != null) {
                    return new BitmapDrawable((Resources) null, bitmap);
                }
                r9.A04(R.string.error_load_wallpaper, 0);
                return drawable2;
            } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e2) {
                e = e2;
                drawable = drawable2;
                Log.e("wallpaper/set-global-wallpaper", e);
                r9.A04(R.string.error_load_wallpaper, 0);
                return drawable;
            }
        } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e3) {
            e = e3;
            Log.e("wallpaper/set-global-wallpaper", e);
            r9.A04(R.string.error_load_wallpaper, 0);
            return drawable;
        }
    }

    public static Drawable A04(C002701k r3, File file, Context context, Resources resources) {
        if (file.exists()) {
            try {
                Bitmap bitmap = C002001d.A0n(file, AnonymousClass02J.A01(AnonymousClass02J.A00(context), true, r3)).A02;
                if (bitmap != null) {
                    Log.d("wallpaper/get found bitmap in wallpaper.jpg");
                    return new BitmapDrawable(resources, bitmap);
                }
                Log.d("wallpaper/get no bitmap in wallpaper.jpg");
                return null;
            } catch (OutOfMemoryError e) {
                Log.e(e);
            }
        }
        return null;
    }

    public static Message A05(String str, AnonymousClass02N r4, AnonymousClass02N r5, String str2, AnonymousClass02P r7, int i) {
        Message obtain = Message.obtain(null, 0, 188, 0, r7);
        obtain.getData().putString("id", str);
        obtain.getData().putParcelable("jid", r4);
        obtain.getData().putParcelable("contextJid", r5);
        obtain.getData().putString("msgId", str2);
        obtain.getData().putInt("retryCount", i);
        return obtain;
    }

    public static Message A06(byte[] bArr, byte[] bArr2, Runnable runnable) {
        return Message.obtain(null, 0, 74, 0, new AnonymousClass02Q(bArr, bArr2, runnable));
    }

    public static AnonymousClass02R A07(Resources resources) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            int identifier = resources.getIdentifier("wallpapers", "array", "com.whatsapp.wallpaper");
            if (identifier != 0) {
                String[] stringArray = resources.getStringArray(identifier);
                for (String str : stringArray) {
                    int identifier2 = resources.getIdentifier(str, "drawable", "com.whatsapp.wallpaper");
                    if (identifier2 != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("_small");
                        int identifier3 = resources.getIdentifier(sb.toString(), "drawable", "com.whatsapp.wallpaper");
                        if (identifier3 != 0) {
                            arrayList.add(Integer.valueOf(identifier3));
                            arrayList2.add(Integer.valueOf(identifier2));
                        }
                    }
                }
            }
        } catch (Resources.NotFoundException e) {
            Log.e("WallpaperUtils/resource not found", e);
        }
        return new AnonymousClass02R(arrayList, arrayList2);
    }

    public static AnonymousClass02N A08(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (AnonymousClass02N) extras.getParcelable("chat_jid");
        }
        return null;
    }

    public static AnonymousClass02N A09(Jid jid) {
        if (jid instanceof DeviceJid) {
            return ((DeviceJid) jid).userJid;
        }
        if (jid instanceof AnonymousClass02N) {
            return (AnonymousClass02N) jid;
        }
        return null;
    }

    public static AnonymousClass02U A0A(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append("g.us");
        String obj = sb.toString();
        Jid nullable = Jid.getNullable(obj);
        if (nullable instanceof AnonymousClass02U) {
            return (AnonymousClass02U) nullable;
        }
        throw new AnonymousClass02Y(obj);
    }

    public static UserJid A0B(String str) {
        AnonymousClass02Z r1 = AnonymousClass02Z.A00;
        return ("".equals(str) || r1.getRawString().equals(str)) ? r1 : UserJid.getNullable(str);
    }

    public static final Object A0C(XmlPullParser xmlPullParser, String[] strArr) {
        int next;
        int i;
        int i2;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        int i3 = 1;
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0S("Unexpected end tag in <string>: ")));
                    } else if (next2 == 4) {
                        StringBuilder A0S = AnonymousClass008.A0S(str);
                        A0S.append(xmlPullParser.getText());
                        str = A0S.toString();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0S("Unexpected start tag in <string>: ")));
                    }
                }
            } else {
                try {
                    if (name.equals("int")) {
                        obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
                    } else if (name.equals("long")) {
                        obj = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
                    } else if (name.equals("float")) {
                        obj = Float.valueOf(xmlPullParser.getAttributeValue(null, "value"));
                    } else if (name.equals("double")) {
                        obj = Double.valueOf(xmlPullParser.getAttributeValue(null, "value"));
                    } else {
                        obj = name.equals("boolean") ? Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value")) : null;
                    }
                    if (obj == null) {
                        if (name.equals("byte-array")) {
                            try {
                                int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                byte[] bArr = new byte[parseInt];
                                int eventType = xmlPullParser.getEventType();
                                do {
                                    if (eventType == 4) {
                                        if (parseInt > 0) {
                                            String text = xmlPullParser.getText();
                                            if (text == null || text.length() != (parseInt << 1)) {
                                                throw new XmlPullParserException(AnonymousClass008.A0K("Invalid value found in byte-array: ", text));
                                            }
                                            int i4 = 0;
                                            while (i4 < parseInt) {
                                                int i5 = i4 << 1;
                                                char charAt = text.charAt(i5);
                                                char charAt2 = text.charAt(i5 + i3);
                                                if (charAt > 'a') {
                                                    i = (charAt - 'a') + 10;
                                                } else {
                                                    i = charAt - '0';
                                                }
                                                if (charAt2 > 'a') {
                                                    i2 = (charAt2 - 'a') + 10;
                                                } else {
                                                    i2 = charAt2 - '0';
                                                }
                                                bArr[i4] = (byte) ((i2 & 15) | ((i & 15) << 4));
                                                i4++;
                                                i3 = 1;
                                            }
                                        }
                                    } else if (eventType == 3) {
                                        if (xmlPullParser.getName().equals("byte-array")) {
                                            strArr[0] = attributeValue;
                                            return bArr;
                                        }
                                        throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "byte-array", " end tag at: ")));
                                    }
                                    eventType = xmlPullParser.next();
                                } while (eventType != i3);
                                throw new XmlPullParserException("Document ended before byte-array end tag");
                            } catch (NullPointerException unused) {
                                throw new XmlPullParserException("Need num attribute in byte-array");
                            } catch (NumberFormatException unused2) {
                                throw new XmlPullParserException("Not a number in num attribute in byte-array");
                            }
                        } else if (name.equals("int-array")) {
                            try {
                                int parseInt2 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                xmlPullParser.next();
                                int[] iArr = new int[parseInt2];
                                int eventType2 = xmlPullParser.getEventType();
                                int i6 = 0;
                                do {
                                    if (eventType2 == 2) {
                                        if (xmlPullParser.getName().equals("item")) {
                                            try {
                                                iArr[i6] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                                            } catch (NullPointerException unused3) {
                                                throw new XmlPullParserException("Need value attribute in item");
                                            } catch (NumberFormatException unused4) {
                                                throw new XmlPullParserException("Not a number in value attribute in item");
                                            }
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0S("Expected item tag at: ")));
                                        }
                                    } else if (eventType2 == 3) {
                                        if (xmlPullParser.getName().equals("int-array")) {
                                            strArr[0] = attributeValue;
                                            return iArr;
                                        } else if (xmlPullParser.getName().equals("item")) {
                                            i6++;
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "int-array", " end tag at: ")));
                                        }
                                    }
                                    eventType2 = xmlPullParser.next();
                                } while (eventType2 != 1);
                                throw new XmlPullParserException("Document ended before int-array end tag");
                            } catch (NullPointerException unused5) {
                                throw new XmlPullParserException("Need num attribute in int-array");
                            } catch (NumberFormatException unused6) {
                                throw new XmlPullParserException("Not a number in num attribute in int-array");
                            }
                        } else if (name.equals("long-array")) {
                            try {
                                int parseInt3 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                xmlPullParser.next();
                                long[] jArr = new long[parseInt3];
                                int eventType3 = xmlPullParser.getEventType();
                                int i7 = 0;
                                do {
                                    if (eventType3 == 2) {
                                        if (xmlPullParser.getName().equals("item")) {
                                            try {
                                                jArr[i7] = Long.parseLong(xmlPullParser.getAttributeValue(null, "value"));
                                            } catch (NullPointerException unused7) {
                                                throw new XmlPullParserException("Need value attribute in item");
                                            } catch (NumberFormatException unused8) {
                                                throw new XmlPullParserException("Not a number in value attribute in item");
                                            }
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0S("Expected item tag at: ")));
                                        }
                                    } else if (eventType3 == 3) {
                                        if (xmlPullParser.getName().equals("long-array")) {
                                            strArr[0] = attributeValue;
                                            return jArr;
                                        } else if (xmlPullParser.getName().equals("item")) {
                                            i7++;
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "long-array", " end tag at: ")));
                                        }
                                    }
                                    eventType3 = xmlPullParser.next();
                                } while (eventType3 != 1);
                                throw new XmlPullParserException("Document ended before long-array end tag");
                            } catch (NullPointerException unused9) {
                                throw new XmlPullParserException("Need num attribute in long-array");
                            } catch (NumberFormatException unused10) {
                                throw new XmlPullParserException("Not a number in num attribute in long-array");
                            }
                        } else if (name.equals("double-array")) {
                            try {
                                int parseInt4 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                xmlPullParser.next();
                                double[] dArr = new double[parseInt4];
                                int eventType4 = xmlPullParser.getEventType();
                                int i8 = 0;
                                do {
                                    if (eventType4 == 2) {
                                        if (xmlPullParser.getName().equals("item")) {
                                            try {
                                                dArr[i8] = Double.parseDouble(xmlPullParser.getAttributeValue(null, "value"));
                                            } catch (NullPointerException unused11) {
                                                throw new XmlPullParserException("Need value attribute in item");
                                            } catch (NumberFormatException unused12) {
                                                throw new XmlPullParserException("Not a number in value attribute in item");
                                            }
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0S("Expected item tag at: ")));
                                        }
                                    } else if (eventType4 == 3) {
                                        if (xmlPullParser.getName().equals("double-array")) {
                                            strArr[0] = attributeValue;
                                            return dArr;
                                        } else if (xmlPullParser.getName().equals("item")) {
                                            i8++;
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "double-array", " end tag at: ")));
                                        }
                                    }
                                    eventType4 = xmlPullParser.next();
                                } while (eventType4 != 1);
                                throw new XmlPullParserException("Document ended before double-array end tag");
                            } catch (NullPointerException unused13) {
                                throw new XmlPullParserException("Need num attribute in double-array");
                            } catch (NumberFormatException unused14) {
                                throw new XmlPullParserException("Not a number in num attribute in double-array");
                            }
                        } else if (name.equals("string-array")) {
                            try {
                                int parseInt5 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                xmlPullParser.next();
                                String[] strArr2 = new String[parseInt5];
                                int eventType5 = xmlPullParser.getEventType();
                                int i9 = 0;
                                do {
                                    if (eventType5 == 2) {
                                        if (xmlPullParser.getName().equals("item")) {
                                            try {
                                                strArr2[i9] = xmlPullParser.getAttributeValue(null, "value");
                                            } catch (NullPointerException unused15) {
                                                throw new XmlPullParserException("Need value attribute in item");
                                            } catch (NumberFormatException unused16) {
                                                throw new XmlPullParserException("Not a number in value attribute in item");
                                            }
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0S("Expected item tag at: ")));
                                        }
                                    } else if (eventType5 == 3) {
                                        if (xmlPullParser.getName().equals("string-array")) {
                                            strArr[0] = attributeValue;
                                            return strArr2;
                                        } else if (xmlPullParser.getName().equals("item")) {
                                            i9++;
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "string-array", " end tag at: ")));
                                        }
                                    }
                                    eventType5 = xmlPullParser.next();
                                } while (eventType5 != 1);
                                throw new XmlPullParserException("Document ended before string-array end tag");
                            } catch (NullPointerException unused17) {
                                throw new XmlPullParserException("Need num attribute in string-array");
                            } catch (NumberFormatException unused18) {
                                throw new XmlPullParserException("Not a number in num attribute in string-array");
                            }
                        } else if (name.equals("boolean-array")) {
                            try {
                                int parseInt6 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"));
                                xmlPullParser.next();
                                boolean[] zArr = new boolean[parseInt6];
                                int eventType6 = xmlPullParser.getEventType();
                                int i10 = 0;
                                do {
                                    if (eventType6 == 2) {
                                        if (xmlPullParser.getName().equals("item")) {
                                            try {
                                                zArr[i10] = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "value"));
                                            } catch (NullPointerException unused19) {
                                                throw new XmlPullParserException("Need value attribute in item");
                                            } catch (NumberFormatException unused20) {
                                                throw new XmlPullParserException("Not a number in value attribute in item");
                                            }
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0S("Expected item tag at: ")));
                                        }
                                    } else if (eventType6 == 3) {
                                        if (xmlPullParser.getName().equals("boolean-array")) {
                                            strArr[0] = attributeValue;
                                            return zArr;
                                        } else if (xmlPullParser.getName().equals("item")) {
                                            i10++;
                                        } else {
                                            throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "boolean-array", " end tag at: ")));
                                        }
                                    }
                                    eventType6 = xmlPullParser.next();
                                } while (eventType6 != 1);
                                throw new XmlPullParserException("Document ended before boolean-array end tag");
                            } catch (NullPointerException unused21) {
                                throw new XmlPullParserException("Need num attribute in string-array");
                            } catch (NumberFormatException unused22) {
                                throw new XmlPullParserException("Not a number in num attribute in string-array");
                            }
                        } else if (name.equals("map")) {
                            xmlPullParser.next();
                            HashMap hashMap = new HashMap();
                            int eventType7 = xmlPullParser.getEventType();
                            do {
                                if (eventType7 == 2) {
                                    hashMap.put(strArr[0], A0C(xmlPullParser, strArr));
                                } else if (eventType7 == 3) {
                                    if (xmlPullParser.getName().equals("map")) {
                                        strArr[0] = attributeValue;
                                        return hashMap;
                                    }
                                    throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "map", " end tag at: ")));
                                }
                                eventType7 = xmlPullParser.next();
                            } while (eventType7 != 1);
                            throw new XmlPullParserException("Document ended before map end tag");
                        } else if (name.equals("list")) {
                            xmlPullParser.next();
                            ArrayList arrayList = new ArrayList();
                            int eventType8 = xmlPullParser.getEventType();
                            do {
                                if (eventType8 == 2) {
                                    arrayList.add(A0C(xmlPullParser, strArr));
                                } else if (eventType8 == 3) {
                                    if (xmlPullParser.getName().equals("list")) {
                                        strArr[0] = attributeValue;
                                        return arrayList;
                                    }
                                    throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "list", " end tag at: ")));
                                }
                                eventType8 = xmlPullParser.next();
                            } while (eventType8 != 1);
                            throw new XmlPullParserException("Document ended before list end tag");
                        } else if (name.equals("set")) {
                            xmlPullParser.next();
                            HashSet hashSet = new HashSet();
                            int eventType9 = xmlPullParser.getEventType();
                            do {
                                if (eventType9 == 2) {
                                    hashSet.add(A0C(xmlPullParser, strArr));
                                } else if (eventType9 == 3) {
                                    if (xmlPullParser.getName().equals("set")) {
                                        strArr[0] = attributeValue;
                                        return hashSet;
                                    }
                                    throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Expected ", "set", " end tag at: ")));
                                }
                                eventType9 = xmlPullParser.next();
                            } while (eventType9 != 1);
                            throw new XmlPullParserException("Document ended before set end tag");
                        } else {
                            throw new XmlPullParserException(AnonymousClass008.A0K("Unknown tag: ", name));
                        }
                    }
                } catch (NullPointerException unused23) {
                    throw new XmlPullParserException(AnonymousClass008.A0L("Need value attribute in <", name, ">"));
                } catch (NumberFormatException unused24) {
                    throw new XmlPullParserException(AnonymousClass008.A0L("Not a number in value attribute in <", name, ">"));
                }
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException(AnonymousClass008.A0L("Unexpected end of document in <", name, ">"));
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Unexpected end tag in <", name, ">: ")));
            } else if (next == 4) {
                throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Unexpected text in <", name, ">: ")));
            }
        } while (next != 2);
        throw new XmlPullParserException(AnonymousClass008.A0R(xmlPullParser, AnonymousClass008.A0Z("Unexpected start tag in <", name, ">: ")));
    }

    public static String A0D(Jid jid) {
        if (jid == null) {
            return null;
        }
        return jid.getRawString();
    }

    public static String A0E(String str, Class cls) {
        Jid nullable = Jid.getNullable(str);
        return (nullable == null || !cls.isAssignableFrom(nullable.getClass())) ? str : nullable.getObfuscatedString();
    }

    public static ArrayList A0F(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        A0P(collection, arrayList);
        return arrayList;
    }

    public static List A0G(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return arrayList;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Jid nullable = Jid.getNullable((String) it.next());
            if (cls.isInstance(nullable)) {
                arrayList.add(cls.cast(nullable));
            }
        }
        return arrayList;
    }

    public static List A0H(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                Jid nullable = Jid.getNullable(str);
                if (UserJid.class.isInstance(nullable)) {
                    arrayList.add(UserJid.class.cast(nullable));
                }
            }
        }
        return arrayList;
    }

    public static Locale A0I(Configuration configuration) {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        return locale2 == null ? Locale.US : locale2;
    }

    public static void A0J(Context context, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(C004402b.A03(C004302a.A00(context, R.color.black), (int) ((((float) i) / 100.0f) * 255.0f)), PorterDuff.Mode.DARKEN));
    }

    public static void A0K(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, Map map, boolean z) {
        SharedPreferences.Editor editor = null;
        SharedPreferences.Editor editor2 = null;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (sharedPreferences.contains(str)) {
                if (!z || !sharedPreferences2.contains(str)) {
                    if (editor == null) {
                        editor = sharedPreferences2.edit();
                    }
                    Class cls = (Class) entry.getValue();
                    if (cls == Boolean.class) {
                        editor.putBoolean(str, sharedPreferences.getBoolean(str, false));
                    } else if (cls == Integer.class) {
                        editor.putInt(str, sharedPreferences.getInt(str, 0));
                    } else if (cls == Float.class) {
                        editor.putFloat(str, sharedPreferences.getFloat(str, 0.0f));
                    } else if (cls == Long.class) {
                        editor.putLong(str, sharedPreferences.getLong(str, 0));
                    } else if (cls == String.class) {
                        editor.putString(str, sharedPreferences.getString(str, null));
                    } else if (Set.class.isAssignableFrom(cls)) {
                        editor.putStringSet(str, sharedPreferences.getStringSet(str, null));
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot access value of type ");
                        sb.append(cls);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (editor2 == null) {
                    editor2 = sharedPreferences.edit();
                }
                editor2.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (editor2 != null) {
            editor2.commit();
        }
    }

    public static void A0L(Bundle bundle, String str, Jid jid, DeviceJid deviceJid, String str2) {
        bundle.putString("id", str);
        bundle.putParcelable("jid", jid);
        bundle.putParcelable("callCreatorJid", deviceJid);
        bundle.putString("callId", str2);
    }

    public static void A0M(AnonymousClass009 r4, Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid == null) {
                r4.A04("Jids/deviceJidsToUserJids/null-jid", null, true);
            } else {
                collection.add(deviceJid.userJid);
            }
        }
    }

    public static void A0N(C000300f r7, Activity activity, AnonymousClass02N r9, AbstractC004502c r10, int i) {
        if (!r7.A0D(AbstractC000400g.A2e)) {
            List asList = Arrays.asList(new C005902w(new Intent(activity, ResetWallpaper.class), R.string.no_wallpaper, R.drawable.clear), new C005902w(new Intent(activity, GalleryPickerLauncher.class), R.string.gallery_picker_label, R.drawable.ic_gallery), new C005902w(new Intent(activity, SolidColorWallpaper.class), R.string.solid_color_wallpaper, R.drawable.ic_menu_solid_color_wallpaper), new C005902w(new Intent(activity, WallpaperPicker.class).putExtra("chat_jid", (Parcelable) null).putExtra("is_using_global_wallpaper", true), R.string.wallpaper_package, 0), new C005902w(new Intent(activity, DefaultWallpaper.class), R.string.default_wallpaper, R.drawable.ic_menu_default_wallpaper));
            Bundle A01 = AnonymousClass008.A01("title_resource", R.string.pick_wallpaper_title);
            A01.putParcelableArrayList("choosable_intents", new ArrayList<>(asList));
            A01.putInt("request_code", i);
            IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = new IntentChooserBottomSheetDialogFragment();
            intentChooserBottomSheetDialogFragment.A0N(A01);
            r10.APm(intentChooserBottomSheetDialogFragment);
        } else if (r9 == null || C002001d.A3E(activity)) {
            Intent intent = new Intent(activity, WallpaperCurrentPreviewActivity.class);
            intent.putExtra("chat_jid", r9);
            activity.startActivity(intent);
        } else {
            Intent intent2 = new Intent(activity, WallpaperCategoriesActivity.class);
            intent2.putExtra("chat_jid", r9);
            activity.startActivity(intent2);
        }
    }

    public static void A0O(Class cls, Collection collection, Collection collection2) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid nullable = Jid.getNullable((String) it.next());
                if (cls.isInstance(nullable)) {
                    collection2.add(cls.cast(nullable));
                }
            }
        }
    }

    public static void A0P(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (jid != null) {
                collection.add(jid.getRawString());
            }
        }
    }

    public static final void A0Q(Object obj, String str, XmlSerializer xmlSerializer) {
        int i;
        int i2;
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else {
                int i3 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    xmlSerializer.startTag(null, "byte-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    int length = bArr.length;
                    xmlSerializer.attribute(null, "num", Integer.toString(length));
                    StringBuilder sb = new StringBuilder(length << 1);
                    while (i3 < length) {
                        byte b = bArr[i3];
                        int i4 = (b >> 4) & 15;
                        if (i4 >= 10) {
                            i = (i4 + 97) - 10;
                        } else {
                            i = i4 + 48;
                        }
                        sb.append((char) i);
                        int i5 = b & 15;
                        if (i5 >= 10) {
                            i2 = (i5 + 97) - 10;
                        } else {
                            i2 = i5 + 48;
                        }
                        sb.append((char) i2);
                        i3++;
                    }
                    xmlSerializer.text(sb.toString());
                    xmlSerializer.endTag(null, "byte-array");
                    return;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    xmlSerializer.startTag(null, "int-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    int length2 = iArr.length;
                    xmlSerializer.attribute(null, "num", Integer.toString(length2));
                    while (i3 < length2) {
                        xmlSerializer.startTag(null, "item");
                        xmlSerializer.attribute(null, "value", Integer.toString(iArr[i3]));
                        xmlSerializer.endTag(null, "item");
                        i3++;
                    }
                    xmlSerializer.endTag(null, "int-array");
                    return;
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    xmlSerializer.startTag(null, "long-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    int length3 = jArr.length;
                    xmlSerializer.attribute(null, "num", Integer.toString(length3));
                    while (i3 < length3) {
                        xmlSerializer.startTag(null, "item");
                        xmlSerializer.attribute(null, "value", Long.toString(jArr[i3]));
                        xmlSerializer.endTag(null, "item");
                        i3++;
                    }
                    xmlSerializer.endTag(null, "long-array");
                    return;
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    xmlSerializer.startTag(null, "double-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    int length4 = dArr.length;
                    xmlSerializer.attribute(null, "num", Integer.toString(length4));
                    while (i3 < length4) {
                        xmlSerializer.startTag(null, "item");
                        xmlSerializer.attribute(null, "value", Double.toString(dArr[i3]));
                        xmlSerializer.endTag(null, "item");
                        i3++;
                    }
                    xmlSerializer.endTag(null, "double-array");
                    return;
                } else if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    xmlSerializer.startTag(null, "string-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    int length5 = strArr.length;
                    xmlSerializer.attribute(null, "num", Integer.toString(length5));
                    while (i3 < length5) {
                        xmlSerializer.startTag(null, "item");
                        xmlSerializer.attribute(null, "value", strArr[i3]);
                        xmlSerializer.endTag(null, "item");
                        i3++;
                    }
                    xmlSerializer.endTag(null, "string-array");
                    return;
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    xmlSerializer.startTag(null, "boolean-array");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    int length6 = zArr.length;
                    xmlSerializer.attribute(null, "num", Integer.toString(length6));
                    while (i3 < length6) {
                        xmlSerializer.startTag(null, "item");
                        xmlSerializer.attribute(null, "value", Boolean.toString(zArr[i3]));
                        xmlSerializer.endTag(null, "item");
                        i3++;
                    }
                    xmlSerializer.endTag(null, "boolean-array");
                    return;
                } else if (obj instanceof Map) {
                    A0R((Map) obj, str, xmlSerializer);
                    return;
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    xmlSerializer.startTag(null, "list");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        A0Q(list.get(i6), null, xmlSerializer);
                    }
                    xmlSerializer.endTag(null, "list");
                    return;
                } else if (obj instanceof Set) {
                    Set<Object> set = (Set) obj;
                    xmlSerializer.startTag(null, "set");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    for (Object obj2 : set) {
                        A0Q(obj2, null, xmlSerializer);
                    }
                    xmlSerializer.endTag(null, "set");
                    return;
                } else if (obj instanceof CharSequence) {
                    xmlSerializer.startTag(null, "string");
                    if (str != null) {
                        xmlSerializer.attribute(null, "name", str);
                    }
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag(null, "string");
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("writeValueXml: unable to write value ");
                    sb2.append(obj);
                    throw new RuntimeException(sb2.toString());
                }
            }
            xmlSerializer.startTag(null, str2);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, "value", obj.toString());
            xmlSerializer.endTag(null, str2);
        }
    }

    public static final void A0R(Map map, String str, XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            A0Q(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static boolean A0S(Jid jid) {
        int type;
        return jid != null && ((type = jid.getType()) == 0 || type == 1 || type == 3 || type == 7) && !A0a(jid);
    }

    public static boolean A0T(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        return type == 3 || type == 6 || type == 5;
    }

    public static boolean A0U(Jid jid) {
        return jid != null && jid.getType() == 3;
    }

    public static boolean A0V(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        return type == 10 || type == 0 || type == 17;
    }

    public static boolean A0W(Jid jid) {
        return jid != null && AnonymousClass020.A03.contains(jid.user);
    }

    public static boolean A0X(Jid jid) {
        return jid != null && jid.getType() == 9;
    }

    public static boolean A0Y(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        return type == 1 || type == 2;
    }

    public static boolean A0Z(Jid jid) {
        return jid != null && jid.isProtocolCompliant();
    }

    public static boolean A0a(Jid jid) {
        return jid != null && jid.getType() == 7;
    }

    public static boolean A0b(Jid jid) {
        return jid != null && jid.getType() == 5;
    }

    public static boolean A0c(Jid jid) {
        return jid != null && jid.equals(UserJid.WHATSAPP_SURVEY);
    }

    public static boolean A0d(Jid jid) {
        return jid != null && jid.getType() == 2;
    }

    public static boolean A0e(Jid jid) {
        return jid != null && jid.getType() == 0;
    }

    public static int[] A0f(Context context, C000300f r2) {
        boolean A0D = r2.A0D(AbstractC000400g.A2e);
        Resources resources = context.getResources();
        if (A0D) {
            return resources.getIntArray(R.array.solid_color_wallpaperv2_colors);
        }
        return resources.getIntArray(R.array.solid_color_wallpaper_colors);
    }

    public static String[] A0g(Collection collection) {
        return (String[]) A0F(collection).toArray(new String[0]);
    }
}
