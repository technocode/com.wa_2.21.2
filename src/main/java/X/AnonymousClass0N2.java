package X;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.animation.ValueAnimator;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.icu.text.DecimalFormatSymbols;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.Size;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.biometric.DeviceCredentialHandlerActivity;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.0N2  reason: invalid class name */
public class AnonymousClass0N2 {
    public static LayoutTransition A00;
    public static Class A01;
    public static Field A02;
    public static Field A03;
    public static Field A04;
    public static Field A05;
    public static Field A06;
    public static Field A07;
    public static Method A08;
    public static Method A09;
    public static Method A0A;
    public static boolean A0B;
    public static boolean A0C;
    public static boolean A0D;
    public static boolean A0E;
    public static boolean A0F;
    public static boolean A0G;
    public static boolean A0H;
    public static boolean A0I;
    public static boolean A0J;
    public static boolean A0K;
    public static boolean A0L;

    public static boolean A1b(int i) {
        return i >= 28 && i <= 31;
    }

    public static double A00(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0.0d;
        }
        return ((double) Math.max(i, i2)) / ((double) Math.min(i, i2));
    }

    public static float A01(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!A1m(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int A02(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw new RuntimeException(AnonymousClass008.A0F("Could not convert flash mode to optic: ", i));
                }
            }
        }
        return i2;
    }

    public static int A03(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }

    public static int A04(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    public static int A05(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() >> 1) + rect.left) - ((rect2.width() >> 1) + rect2.left));
        }
        return Math.abs(((rect.height() >> 1) + rect.top) - ((rect2.height() >> 1) + rect2.top));
    }

    public static int A06(Context context, String str) {
        String permissionToOp;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT < 23 || (permissionToOp = AppOpsManager.permissionToOp(str)) == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        if (Build.VERSION.SDK_INT < 23 || ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) != 0) {
            return -2;
        }
        return 0;
    }

    public static int A07(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!A1m(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static int A08(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("`");
        sb.append(str);
        sb.append("`");
        return cursor.getColumnIndexOrThrow(sb.toString());
    }

    public static int A09(CameraManager cameraManager, String str, CaptureRequest.Builder builder, AnonymousClass0VM r8, AnonymousClass0VO r9) {
        if (r8 == null || r9 == null) {
            throw new IllegalStateException("Trying to update builder for focus mode after camera closed.");
        }
        int i = 0;
        int intValue = ((Number) r8.A00(AnonymousClass0VN.A0B)).intValue();
        if (intValue == 4) {
            if (AnonymousClass0VQ.A01(cameraManager, str, 4)) {
                i = 4;
            }
        } else if (intValue == 3) {
            if (AnonymousClass0VQ.A01(cameraManager, str, 3)) {
                i = 3;
            }
        } else if (intValue == 1 && AnonymousClass0VQ.A01(cameraManager, str, 1)) {
            i = 1;
        }
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
        return i;
    }

    public static int A0A(Layout layout) {
        int i = 0;
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            int max = Math.max(0, layout.getLineCount() - 1);
            float lineDescent = (float) (layout.getLineDescent(max) - layout.getLineAscent(max));
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            i = spacingAdd >= 0.0f ? (int) (((double) spacingAdd) + 0.5d) : -((int) (((double) (-spacingAdd)) + 0.5d));
        }
        return layout.getHeight() - i;
    }

    public static int A0B(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static int A0C(AnonymousClass0VR r1, AnonymousClass0VS r2, View view, View view2, AnonymousClass0VT r5, boolean z) {
        if (r5.A0A() == 0 || r1.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AnonymousClass0VT.A06(view) - AnonymousClass0VT.A06(view2)) + 1;
        }
        return Math.min(r2.A05(), r2.A06(view2) - r2.A09(view));
    }

    public static int A0D(AnonymousClass0VR r3, AnonymousClass0VS r4, View view, View view2, AnonymousClass0VT r7, boolean z) {
        int A002;
        if (r7.A0A() == 0 || (A002 = r3.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return A002;
        }
        return (int) ((((float) (r4.A06(view2) - r4.A09(view))) / ((float) (Math.abs(AnonymousClass0VT.A06(view) - AnonymousClass0VT.A06(view2)) + 1))) * ((float) r3.A00()));
    }

    public static int A0E(AnonymousClass0VR r4, AnonymousClass0VS r5, View view, View view2, AnonymousClass0VT r8, boolean z, boolean z2) {
        int max;
        if (r8.A0A() == 0 || r4.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(AnonymousClass0VT.A06(view), AnonymousClass0VT.A06(view2));
        int max2 = Math.max(AnonymousClass0VT.A06(view), AnonymousClass0VT.A06(view2));
        if (z2) {
            max = Math.max(0, (r4.A00() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(r5.A06(view2) - r5.A09(view))) / ((float) (Math.abs(AnonymousClass0VT.A06(view) - AnonymousClass0VT.A06(view2)) + 1)))) + ((float) (r5.A04() - r5.A09(view))));
    }

    public static int A0F(AnonymousClass0VU r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        sb.append(r2);
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return i;
    }

    public static int A0G(AnonymousClass0VV r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("Could not convert camera facing from optic: ");
        sb.append(r2);
        throw new RuntimeException(sb.toString());
    }

    public static int A0H(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 109935:
                    if (str.equals("off")) {
                        return 0;
                    }
                    break;
                case 1628397:
                    if (str.equals("50hz")) {
                        return 1;
                    }
                    break;
                case 1658188:
                    if (str.equals("60hz")) {
                        return 2;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 3;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0I(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1635350969:
                    if (str.equals("blackboard")) {
                        return 7;
                    }
                    break;
                case 3002044:
                    if (str.equals("aqua")) {
                        return 8;
                    }
                    break;
                case 3357411:
                    if (str.equals("mono")) {
                        return 1;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        return 0;
                    }
                    break;
                case 109324790:
                    if (str.equals("sepia")) {
                        return 4;
                    }
                    break;
                case 261182557:
                    if (str.equals("whiteboard")) {
                        return 6;
                    }
                    break;
                case 921111605:
                    if (str.equals("negative")) {
                        return 2;
                    }
                    break;
                case 1473417203:
                    if (str.equals("solarize")) {
                        return 3;
                    }
                    break;
                case 2008448231:
                    if (str.equals("posterize")) {
                        return 5;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0J(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 3551:
                    if (str.equals("on")) {
                        return 1;
                    }
                    break;
                case 109935:
                    if (str.equals("off")) {
                        return 0;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 2;
                    }
                    break;
                case 110547964:
                    if (str.equals("torch")) {
                        return 3;
                    }
                    break;
                case 1081542389:
                    if (str.equals("red-eye")) {
                        return 4;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0K(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -194628547:
                    if (str.equals("continuous-video")) {
                        return 3;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 1;
                    }
                    break;
                case 3108534:
                    if (str.equals("edof")) {
                        return 5;
                    }
                    break;
                case 97445748:
                    if (str.equals("fixed")) {
                        return 0;
                    }
                    break;
                case 103652300:
                    if (str.equals("macro")) {
                        return 2;
                    }
                    break;
                case 173173288:
                    if (str.equals("infinity")) {
                        return 6;
                    }
                    break;
                case 910005312:
                    if (str.equals("continuous-picture")) {
                        return 4;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0L(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1422950858:
                    if (str.equals("action")) {
                        return 2;
                    }
                    break;
                case -1350043241:
                    if (str.equals("theatre")) {
                        return 7;
                    }
                    break;
                case -895760513:
                    if (str.equals("sports")) {
                        return 13;
                    }
                    break;
                case -891172202:
                    if (str.equals("sunset")) {
                        return 10;
                    }
                    break;
                case -333584256:
                    if (str.equals("barcode")) {
                        return 16;
                    }
                    break;
                case -300277408:
                    if (str.equals("steadyphoto")) {
                        return 11;
                    }
                    break;
                case -264202484:
                    if (str.equals("fireworks")) {
                        return 12;
                    }
                    break;
                case 103158:
                    if (str.equals("hdr")) {
                        return 17;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 0;
                    }
                    break;
                case 3535235:
                    if (str.equals("snow")) {
                        return 9;
                    }
                    break;
                case 93610339:
                    if (str.equals("beach")) {
                        return 8;
                    }
                    break;
                case 104817688:
                    if (str.equals("night")) {
                        return 5;
                    }
                    break;
                case 106437350:
                    if (str.equals("party")) {
                        return 14;
                    }
                    break;
                case 729267099:
                    if (str.equals("portrait")) {
                        return 3;
                    }
                    break;
                case 1430647483:
                    if (str.equals("landscape")) {
                        return 4;
                    }
                    break;
                case 1664284080:
                    if (str.equals("night-portrait")) {
                        return 6;
                    }
                    break;
                case 1900012073:
                    if (str.equals("candlelight")) {
                        return 15;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int A0M(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -939299377:
                    if (str.equals("incandescent")) {
                        return 2;
                    }
                    break;
                case -719316704:
                    if (str.equals("warm-fluorescent")) {
                        return 4;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        return 1;
                    }
                    break;
                case 109399597:
                    if (str.equals("shade")) {
                        return 8;
                    }
                    break;
                case 474934723:
                    if (str.equals("cloudy-daylight")) {
                        return 6;
                    }
                    break;
                case 1650323088:
                    if (str.equals("twilight")) {
                        return 7;
                    }
                    break;
                case 1902580840:
                    if (str.equals("fluorescent")) {
                        return 3;
                    }
                    break;
                case 1942983418:
                    if (str.equals("daylight")) {
                        return 5;
                    }
                    break;
            }
        }
        return -1;
    }

    public static long A0N(int i, int i2) {
        int floatToRawIntBits = Float.floatToRawIntBits((float) i);
        return ((long) Float.floatToRawIntBits((float) i2)) | (((long) floatToRawIntBits) << 32);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:168:0x0009 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:173:0x0009 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.animation.Animator[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: android.animation.PropertyValuesHolder[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02cc, code lost:
        if (r5 == null) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        if (A1b(r1.type) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013d, code lost:
        if (r2 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
        if (A1b(r2.type) != false) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator A0O(android.content.Context r24, android.content.res.Resources r25, android.content.res.Resources.Theme r26, org.xmlpull.v1.XmlPullParser r27, android.util.AttributeSet r28, android.animation.AnimatorSet r29, int r30) {
        /*
        // Method dump skipped, instructions count: 809
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A0O(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static ObjectAnimator A0P(Object obj, Property property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(obj, new AnonymousClass0VX(property, path), 0.0f, 1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0117, code lost:
        if (r16 == 0) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder A0Q(android.content.res.TypedArray r15, int r16, int r17, int r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A0Q(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static ValueAnimator A0R(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        int resourceId;
        String string;
        String string2;
        String string3;
        String string4;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray A0T = A0T(resources, theme, attributeSet, AnonymousClass0VE.A02);
        TypedArray A0T2 = A0T(resources, theme, attributeSet, AnonymousClass0VE.A06);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        long A072 = (long) A07(A0T, xmlPullParser, "duration", 1, 300);
        int i3 = 0;
        long A073 = (long) A07(A0T, xmlPullParser, "startOffset", 2, 0);
        int A074 = A07(A0T, xmlPullParser, "valueType", 7, 4);
        if (A1m(xmlPullParser, "valueFrom") && A1m(xmlPullParser, "valueTo")) {
            if (A074 == 4) {
                TypedValue peekValue = A0T.peekValue(5);
                if (peekValue != null) {
                    z = true;
                    i = peekValue.type;
                } else {
                    z = false;
                    i = 0;
                }
                TypedValue peekValue2 = A0T.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                    i2 = peekValue2.type;
                } else {
                    z2 = false;
                    i2 = 0;
                }
                if ((!z || !A1b(i)) && (!z2 || !A1b(i2))) {
                    A074 = 0;
                } else {
                    A074 = 3;
                }
            }
            PropertyValuesHolder A0Q = A0Q(A0T, A074, 5, 6, "");
            if (A0Q != null) {
                valueAnimator2.setValues(A0Q);
            }
        }
        valueAnimator2.setDuration(A072);
        valueAnimator2.setStartDelay(A073);
        valueAnimator2.setRepeatCount(A07(A0T, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(A07(A0T, xmlPullParser, "repeatMode", 4, 1));
        if (A0T2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            if (!A1m(xmlPullParser, "pathData") || (string2 = A0T2.getString(1)) == null) {
                if (!A1m(xmlPullParser, "propertyName")) {
                    string = null;
                } else {
                    string = A0T2.getString(0);
                }
                objectAnimator.setPropertyName(string);
            } else {
                if (!A1m(xmlPullParser, "propertyXName")) {
                    string3 = null;
                } else {
                    string3 = A0T2.getString(2);
                }
                if (!A1m(xmlPullParser, "propertyYName")) {
                    string4 = null;
                } else {
                    string4 = A0T2.getString(3);
                }
                if (string3 == null && string4 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0T2.getPositionDescription());
                    sb.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(sb.toString());
                }
                Path A0U = A0U(string2);
                float f = 0.5f * 1.0f;
                PathMeasure pathMeasure = new PathMeasure(A0U, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f2 = 0.0f;
                do {
                    f2 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f2));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(A0U, false);
                int min = Math.min(100, ((int) (f2 / f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f3 = f2 / ((float) (min - 1));
                int i4 = 0;
                float f4 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i3 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f4 - ((Number) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f4 += f3;
                    int i5 = i4 + 1;
                    if (i5 < arrayList.size() && f4 > ((Number) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i5;
                    }
                    i3++;
                }
                if (string3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (string4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(string4, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i3 = 0;
                    objectAnimator.setValues(propertyValuesHolder);
                } else {
                    i3 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            }
        }
        if (A1m(xmlPullParser, "interpolator") && (resourceId = A0T.getResourceId(i3, i3)) > 0) {
            valueAnimator2.setInterpolator(A0b(context, resourceId));
        }
        A0T.recycle();
        if (A0T2 != null) {
            A0T2.recycle();
        }
        return valueAnimator2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList A0S(android.content.res.Resources r15, org.xmlpull.v1.XmlPullParser r16, android.util.AttributeSet r17, android.content.res.Resources.Theme r18) {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A0S(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static TypedArray A0T(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static Path A0U(String str) {
        Path path = new Path();
        AnonymousClass0VJ[] A1q = A1q(str);
        if (A1q == null) {
            return null;
        }
        try {
            AnonymousClass0VJ.A01(A1q, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(AnonymousClass008.A0K("Error in parsing ", str), e);
        }
    }

    public static Drawable A0V(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!A0B) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                A02 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            A0B = true;
        }
        Field field = A02;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                A02 = null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:274:0x0329 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:215:0x03e6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:271:0x04dc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.text.StaticLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.text.Layout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.08V] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.text.BoringLayout] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x033c A[LOOP:0: B:200:0x033c->B:256:0x04e6, LOOP_START, SYNTHETIC, Splitter:B:200:0x033c] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x050b  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout A0W(android.content.Context r28, X.AnonymousClass074 r29, int r30, java.lang.CharSequence r31) {
        /*
        // Method dump skipped, instructions count: 1368
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A0W(android.content.Context, X.074, int, java.lang.CharSequence):android.text.Layout");
    }

    public static StaticLayout A0X(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, AbstractC06520Tq r22) {
        try {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, A0Y(r22), f, f2, z, truncateAt, i3, i4);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, A0Y(r22), f, f2, z, truncateAt, i3, i4);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic A0Y(AbstractC06520Tq r1) {
        if (r1 == C06510Tp.A04) {
            return TextDirectionHeuristics.LTR;
        }
        if (r1 == C06510Tp.A05) {
            return TextDirectionHeuristics.RTL;
        }
        if (r1 == C06510Tp.A01) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (r1 == C06510Tp.A02) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (r1 == C06510Tp.A00) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (r1 == C06510Tp.A03) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static ActionMode.Callback A0Z(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC06890Vc)) ? callback : new ActionMode$CallbackC06890Vc(callback, textView);
    }

    public static Interpolator A0a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, 1.0f);
        }
        return new animation.InterpolatorC06900Vd(f, f2, f3);
    }

    public static Interpolator A0b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i == 17563663) {
            try {
                return new C06910Ve();
            } catch (XmlPullParserException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't load animation resource ID #0x");
                sb.append(Integer.toHexString(i));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't load animation resource ID #0x");
                sb2.append(Integer.toHexString(i));
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
                notFoundException2.initCause(e2);
                throw notFoundException2;
            } catch (Throwable th) {
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i == 17563661) {
            return new C06930Vg();
        } else {
            if (i == 17563662) {
                return new C06940Vh();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            context.getResources();
            context.getTheme();
            int depth = animation.getDepth();
            Interpolator interpolator = null;
            while (true) {
                int next = animation.next();
                if ((next != 3 || animation.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(animation);
                        String name = animation.getName();
                        if (name.equals("linearInterpolator")) {
                            interpolator = new LinearInterpolator();
                        } else if (name.equals("accelerateInterpolator")) {
                            interpolator = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            interpolator = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            interpolator = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            interpolator = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            interpolator = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            interpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            interpolator = new animation.InterpolatorC06950Vi(context, asAttributeSet, animation);
                        } else {
                            throw new RuntimeException(AnonymousClass008.A0R(animation, AnonymousClass008.A0S("Unknown interpolator name: ")));
                        }
                    }
                }
            }
            animation.close();
            return interpolator;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0191, code lost:
        if (r1.size() <= 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0193, code lost:
        r3 = new X.C06960Vj(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0199, code lost:
        if (r16 == false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019b, code lost:
        r3 = new X.C06960Vj(r17, r12, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a3, code lost:
        r3 = new X.C06960Vj(r17, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01aa, code lost:
        if (r14 == 1) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ad, code lost:
        if (r14 == 2) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        r1 = r3.A01;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b3, code lost:
        if (r4 == 1) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b5, code lost:
        if (r4 == 2) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        r26 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ba, code lost:
        r26 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bd, code lost:
        r3 = new android.graphics.SweepGradient(r19, r18, r3.A01, r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ce, code lost:
        if (r24 <= 0.0f) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d0, code lost:
        r2 = r3.A01;
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d4, code lost:
        if (r4 == 1) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d7, code lost:
        if (r4 == 2) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d9, code lost:
        r27 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01dc, code lost:
        r27 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01df, code lost:
        r27 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e1, code lost:
        r3 = new android.graphics.RadialGradient(r19, r18, r24, r2, r1, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f1, code lost:
        r26 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f3, code lost:
        r3 = new android.graphics.LinearGradient(r20, r21, r22, r23, r1, r0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0203, code lost:
        return new X.AnonymousClass0VK(r3, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0VK A0c(android.content.res.TypedArray r24, org.xmlpull.v1.XmlPullParser r25, android.content.res.Resources.Theme r26, java.lang.String r27, int r28) {
        /*
        // Method dump skipped, instructions count: 598
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A0c(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):X.0VK");
    }

    public static C06970Vk A0d(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 28) {
            return new C06970Vk(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        if (i >= 23) {
            i2 = 1;
            i3 = 1;
        }
        if (i >= 18) {
            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        } else {
            textDirectionHeuristic = null;
        }
        if (i >= 23) {
            i2 = textView.getBreakStrategy();
            i3 = textView.getHyphenationFrequency();
        }
        if (i >= 18) {
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (i < 28 || (textView.getInputType() & 15) != 3) {
                if (textView.getLayoutDirection() == 1) {
                    z = true;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C06970Vk(textPaint, textDirectionHeuristic, i2, i3);
    }

    public static EnumC06980Vl A0e(int i) {
        if (i == 0) {
            return EnumC06980Vl.EXPONENTIAL;
        }
        if (i == 1) {
            return EnumC06980Vl.LINEAR;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0G("Could not convert ", i, " to BackoffPolicy"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x005e A[SYNTHETIC, Splitter:B:36:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C06990Vm A0f(byte[] r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A0f(byte[]):X.0Vm");
    }

    public static EnumC07010Vo A0g(int i) {
        if (i == 0) {
            return EnumC07010Vo.NOT_REQUIRED;
        }
        if (i == 1) {
            return EnumC07010Vo.CONNECTED;
        }
        if (i == 2) {
            return EnumC07010Vo.UNMETERED;
        }
        if (i == 3) {
            return EnumC07010Vo.NOT_ROAMING;
        }
        if (i == 4) {
            return EnumC07010Vo.METERED;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0G("Could not convert ", i, " to NetworkType"));
    }

    public static AnonymousClass0VU A0h(int i) {
        if (i == 0) {
            return AnonymousClass0VU.ENQUEUED;
        }
        if (i == 1) {
            return AnonymousClass0VU.RUNNING;
        }
        if (i == 2) {
            return AnonymousClass0VU.SUCCEEDED;
        }
        if (i == 3) {
            return AnonymousClass0VU.FAILED;
        }
        if (i == 4) {
            return AnonymousClass0VU.BLOCKED;
        }
        if (i == 5) {
            return AnonymousClass0VU.CANCELLED;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0G("Could not convert ", i, " to State"));
    }

    public static C07030Vq A0i(C07020Vp r4) {
        C07030Vq r3 = new C07030Vq();
        r3.A08 = r4.A03;
        float f = r4.A02;
        if (f != Float.MIN_VALUE) {
            r3.A03 = f;
        }
        float f2 = r4.A00;
        if (f2 != Float.MIN_VALUE) {
            r3.A00 = f2;
        }
        return r3;
    }

    public static C07030Vq A0j(C07040Vr r1, float f) {
        C07030Vq r0 = new C07030Vq();
        r0.A08 = r1;
        r0.A03 = f;
        return r0;
    }

    public static C07060Vt A0k(C07050Vs r6) {
        if (r6 == null) {
            return null;
        }
        int i = r6.A05;
        int i2 = r6.A04;
        String str = r6.A09;
        int i3 = r6.A06;
        int A0G2 = A0G(r6.A08);
        boolean z = r6.A0A;
        return new C07060Vt(i, i2, str, i3, A0G2);
    }

    public static C07070Vu A0l(C07070Vu r9, C07070Vu r10) {
        int i = r9.A01;
        int i2 = r9.A00;
        double A002 = A00(i, i2);
        int i3 = r10.A01;
        int i4 = r10.A00;
        if (Math.abs(A002 - A00(i3, i4)) <= ((double) 0.02f)) {
            return r9;
        }
        if ((i3 - i4) * (i - i2) < 0) {
            r10 = new C07070Vu(i4, i3);
        }
        float f = (float) r10.A00;
        float f2 = (float) r10.A01;
        int i5 = (int) ((f / f2) * ((float) i));
        if (i5 <= i2) {
            return new C07070Vu(i, i5);
        }
        return new C07070Vu((int) ((f2 / f) * ((float) i2)), i2);
    }

    public static C07070Vu A0m(List list, C07070Vu r20, double d, Set set) {
        C07070Vu r7 = null;
        int i = r20.A01;
        int i2 = r20.A00;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        if (d <= 0.0d) {
            d = A00(i, i2);
        }
        double d2 = Double.MAX_VALUE;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C07070Vu r6 = (C07070Vu) it.next();
            int i3 = r6.A01;
            int i4 = r6.A00;
            int max2 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            double A002 = A00(i3, i4);
            if (set == null || set.isEmpty() || set.contains(Double.valueOf(A002))) {
                if (max2 == max && min2 == min && Math.abs(A002 - d) <= 0.001d) {
                    return r6;
                }
                double abs = Math.abs(d - A002);
                double d3 = abs - d2;
                if (d3 <= 0.001d) {
                    if (Math.abs(d3) > 0.001d) {
                        d2 = abs;
                        r7 = null;
                        z = false;
                    }
                    if (max2 < max || min2 < min) {
                        if (!z) {
                            if (r7 != null && Long.signum((((long) i3) * ((long) i4)) - (((long) r7.A01) * ((long) r7.A00))) <= 0) {
                            }
                        }
                    } else if (!z) {
                        z = true;
                    } else if (r7 != null) {
                        if (Long.signum((((long) i3) * ((long) i4)) - (((long) r7.A01) * ((long) r7.A00))) >= 0) {
                        }
                    }
                    r7 = r6;
                }
            }
        }
        return r7;
    }

    public static C07120Vz A0n(C07080Vv r16, int i, int i2, CharSequence charSequence, C07090Vw r20, AnonymousClass074 r21) {
        int i3;
        float f;
        float f2;
        int ellipsisStart;
        CharSequence charSequence2 = charSequence;
        Context context = r16.A02;
        C07110Vy r3 = new C07110Vy();
        r3.A02 = r21;
        if (!TextUtils.isEmpty(charSequence2) || r21.A0Y) {
            Layout A0W = A0W(context, r21, i, charSequence2);
            int resolveSize = View.resolveSize(A0W.getWidth(), i);
            int A0A2 = A0A(A0W);
            if (r21.A05 <= 1.0f || !r21.A0X) {
                i3 = 0;
            } else {
                i3 = (int) ((r21.A05 - 1.0f) * ((float) A0W.getPaint().getFontMetricsInt(null)));
                A0A2 += i3;
            }
            int lineCount = A0W.getLineCount();
            if (lineCount < r21.A0H) {
                A0A2 += (r21.A0H - lineCount) * Math.round((((float) A0W.getPaint().getFontMetricsInt(null)) * r21.A05) + r21.A00);
            }
            int resolveSize2 = View.resolveSize(A0A2, i2);
            float A0A3 = (float) A0A(A0W);
            int ordinal = r21.A0S.ordinal();
            if (ordinal == 1) {
                f = (((float) resolveSize2) - A0A3) / 2.0f;
                f2 = ((float) i3) + f;
            } else if (ordinal != 2) {
                f2 = (float) i3;
            } else {
                f = ((float) resolveSize2) - A0A3;
                f2 = ((float) i3) + f;
            }
            CharSequence charSequence3 = r21.A0T;
            if (charSequence3 != null && !charSequence3.equals("")) {
                int i4 = 0;
                while (true) {
                    if (i4 >= A0W.getLineCount()) {
                        break;
                    } else if (A0W.getEllipsisCount(i4) <= 0) {
                        i4++;
                    } else if (i4 != -1) {
                        CharSequence charSequence4 = r21.A0T;
                        int offsetForHorizontal = A0W.getOffsetForHorizontal(i4, A0W.getLineLeft(i4) + (((float) resolveSize) - BoringLayout.getDesiredWidth(charSequence4, 0, charSequence4.length(), A0W.getPaint())));
                        if (offsetForHorizontal > 0) {
                            int i5 = offsetForHorizontal - 1;
                            if (A0W.getEllipsisCount(i4) > 0 && i5 > (ellipsisStart = A0W.getEllipsisStart(i4) + A0W.getLineStart(i4))) {
                                i5 = ellipsisStart;
                            }
                            charSequence2 = TextUtils.concat(charSequence2.subSequence(0, i5), charSequence4);
                        }
                        A0W = A0W(context, r21, View.MeasureSpec.makeMeasureSpec(resolveSize, 1073741824), charSequence2);
                    }
                }
            }
            r3.A03 = charSequence2;
            r3.A01 = A0W;
            r3.A00 = f2;
            if (charSequence2 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence2;
                spanned.getSpans(0, charSequence2.length(), ClickableSpan.class);
                r3.A04 = (ImageSpan[]) spanned.getSpans(0, charSequence2.length(), ImageSpan.class);
            }
            return new C07120Vz(r20, i, i2, resolveSize, resolveSize2, r3);
        }
        r3.A03 = charSequence2;
        return new C07120Vz(r20, i, i2, 0, 0, r3);
    }

    public static File A0o(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder A0S = AnonymousClass008.A0S(".font");
        A0S.append(Process.myPid());
        A0S.append("-");
        A0S.append(Process.myTid());
        A0S.append("-");
        String obj = A0S.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, AnonymousClass008.A0F(obj, i));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static String A0p(int i) {
        if (i == 0) {
            return "auto";
        }
        switch (i) {
            case 2:
                return "action";
            case 3:
                return "portrait";
            case 4:
                return "landscape";
            case 5:
                return "night";
            case 6:
                return "night-portrait";
            case 7:
                return "theatre";
            case 8:
                return "beach";
            case 9:
                return "snow";
            case 10:
                return "sunset";
            case 11:
                return "steadyphoto";
            case 12:
                return "fireworks";
            case 13:
                return "sports";
            case 14:
                return "party";
            case 15:
                return "candlelight";
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return "barcode";
            case 17:
                return "hdr";
            default:
                return null;
        }
    }

    public static String A0q(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AnonymousClass008.A08(32, "unknown status code: ", i);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }

    public static String A0r(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static String A0s(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer A0t(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r1 = r7.getContentResolver()
            r3 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r1.openFileDescriptor(r9, r0, r8)     // Catch:{ IOException -> 0x003c }
            if (r2 != 0) goto L_0x000e
            return r3
        L_0x000e:
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ all -> 0x0035 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0035 }
            r1.<init>(r0)     // Catch:{ all -> 0x0035 }
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch:{ all -> 0x002e }
            long r8 = r4.size()     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x002e }
            r6 = 0
            java.nio.MappedByteBuffer r0 = r4.map(r5, r6, r8)     // Catch:{ all -> 0x002e }
            r1.close()
            r2.close()
            return r0
        L_0x002e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A0t(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static HashSet A0u(Object... objArr) {
        HashSet hashSet = new HashSet();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
        return hashSet;
    }

    public static List A0v(Resources resources, int i) {
        int i2;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i2 = typedValue.type;
            }
            if (i2 == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static List A0w(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(new C07070Vu(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void A0x() {
        if (AnonymousClass0W2.A00 >= 18) {
            Trace.endSection();
        }
    }

    public static synchronized void A0y() {
        synchronized (AnonymousClass0N2.class) {
            if (!A0E) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        C008003w.A00("fb_jpegturbo");
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                C008003w.A00("c++_shared");
                C008003w.A00("static-webp");
                A0E = true;
            }
        }
    }

    public static void A0z(int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        boolean z2 = false;
        if (i4 >= 0) {
            z2 = true;
        }
        A1Y(z2);
        boolean z3 = false;
        if (i >= 0) {
            z3 = true;
        }
        A1Y(z3);
        boolean z4 = false;
        if (i3 >= 0) {
            z4 = true;
        }
        A1Y(z4);
        boolean z5 = false;
        if (i + i4 <= i5) {
            z5 = true;
        }
        A1Y(z5);
        if (i3 + i4 > i2) {
            z = false;
        }
        A1Y(z);
    }

    public static void A10(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    public static void A11(int i, int i2, Rect rect, Rect rect2) {
        if (i2 != 0 && i2 != 180) {
            rect.set(0, 0, rect.height(), rect.width());
            if (i == 90 || i == 270) {
                rect2.set(0, 0, rect2.height(), rect2.width());
            }
        } else if (i == 90 || i == 270) {
            rect2.set(0, 0, rect2.height(), rect2.width());
        }
    }

    public static void A12(CaptureRequest.Builder builder, AnonymousClass0VM r3, AnonymousClass0VO r4) {
        if (r3 == null || r4 == null) {
            throw new IllegalStateException("Trying to update builder for exposure compensation after camera closed.");
        } else if (((Boolean) r4.A00(AnonymousClass0VO.A05)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, r3.A00(AnonymousClass0VN.A07));
        }
    }

    public static void A13(CaptureRequest.Builder builder, AnonymousClass0VM r2, AnonymousClass0VO r3) {
        if (r2 != null && r3 != null) {
            A17(builder, r3, ((Number) r2.A00(AnonymousClass0VN.A09)).intValue());
        }
    }

    public static void A14(CaptureRequest.Builder builder, AnonymousClass0VM r3, AnonymousClass0VO r4) {
        if (r3 == null || r4 == null) {
            throw new IllegalStateException("Trying to update builder for hdr after camera closed.");
        } else if (Build.VERSION.SDK_INT < 22 || !((Boolean) r3.A00(AnonymousClass0VN.A0P)).booleanValue() || !((Boolean) r4.A00(AnonymousClass0VO.A07)).booleanValue()) {
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 0);
        } else {
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, 18);
        }
    }

    public static void A15(CaptureRequest.Builder builder, AnonymousClass0VM r3, AnonymousClass0VO r4) {
        if (r3 == null || r4 == null) {
            throw new IllegalStateException("Trying to update builder for optical stabilization after camera closed.");
        } else if (((Boolean) r4.A00(AnonymousClass0VO.A0B)).booleanValue()) {
            if (!((Boolean) r3.A00(AnonymousClass0VN.A0Q)).booleanValue() || ((Boolean) r3.A00(AnonymousClass0VN.A0O)).booleanValue()) {
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            } else {
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
            }
        }
    }

    public static void A16(CaptureRequest.Builder builder, AnonymousClass0VM r3, AnonymousClass0VO r4) {
        if (r3 == null || r4 == null) {
            throw new IllegalStateException("Trying to update builder for video stabilization after camera closed.");
        } else if (((Boolean) r4.A00(AnonymousClass0VO.A0I)).booleanValue()) {
            if (((Boolean) r3.A00(AnonymousClass0VN.A0R)).booleanValue()) {
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
            } else {
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            }
        }
    }

    public static void A17(CaptureRequest.Builder builder, AnonymousClass0VO r6, int i) {
        if (((List) r6.A00(AnonymousClass0VO.A0V)).contains(Integer.valueOf(i))) {
            if (i == 0) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i == 1) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i != 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                builder.set(CaptureRequest.FLASH_MODE, 2);
            }
        }
    }

    public static void A18(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AnonymousClass008.A0F("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void A19(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        AnonymousClass0W4 r0 = AnonymousClass0W4.A0A;
        if (r0 != null && r0.A05 == view) {
            AnonymousClass0W4.A00(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            AnonymousClass0W4 r1 = AnonymousClass0W4.A09;
            if (r1 != null && r1.A05 == view) {
                r1.A01();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new AnonymousClass0W4(view, charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e8, code lost:
        if (r4 == false) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1A(android.view.ViewGroup r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A1A(android.view.ViewGroup, boolean):void");
    }

    public static void A1B(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof AnonymousClass0W6) {
            ((AnonymousClass0W6) viewParent).AHt(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedPreScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            } else if (viewParent instanceof AnonymousClass0W7) {
                ((AnonymousClass0W7) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static void A1C(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static void A1D(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    public static void A1E(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintList(colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AnonymousClass0W8) {
            ((AnonymousClass0W8) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void A1F(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            imageView.setImageTintMode(mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof AnonymousClass0W8) {
            ((AnonymousClass0W8) imageView).setSupportImageTintMode(mode);
        }
    }

    public static void A1G(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!A0I) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                A09 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            A0I = true;
        }
        Method method = A09;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static void A1H(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            if (!A0G) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    A05 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                A0G = true;
            }
            Field field = A05;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    public static void A1I(TextView textView, int i) {
        int i2;
        C001801b.A1K(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void A1J(TextView textView, int i) {
        int i2;
        C001801b.A1K(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void A1K(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void A1L(TextView textView, ColorStateList colorStateList) {
        if (textView == null) {
            throw null;
        } else if (Build.VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof AbstractC05580Pg) {
            ((AbstractC05580Pg) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void A1M(TextView textView, PorterDuff.Mode mode) {
        if (textView == null) {
            throw null;
        } else if (Build.VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof AbstractC05580Pg) {
            ((AbstractC05580Pg) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void A1N(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            Drawable drawable5 = drawable3;
            if (textView.getLayoutDirection() != 1) {
                drawable5 = drawable;
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void A1O(TextView textView, AnonymousClass0W9 r4) {
        if (Build.VERSION.SDK_INT < 29) {
            C06970Vk A0d = A0d(textView);
            if (r4 == null) {
                throw null;
            } else if (A0d.A00(null)) {
                textView.setText(r4);
            } else {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        } else if (r4 != null) {
            textView.setText((CharSequence) null);
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a1, code lost:
        if (r10.A0l[r39] != 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01cd, code lost:
        if (r27 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x043c, code lost:
        if (r13.A05 != r8) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0451, code lost:
        if (r10 == r0) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x050c, code lost:
        if (r13.A05 != r9) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05ad, code lost:
        if (r9 != null) goto L_0x05af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0606, code lost:
        if (r27 != false) goto L_0x0608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x063f, code lost:
        if (r2 == 2) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0643, code lost:
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010d, code lost:
        if (r3[r12].A03.A06 == r2) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014e, code lost:
        if (r13.A0I == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0184, code lost:
        if (r2 == 2) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0562  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1P(X.AnonymousClass0WA r37, X.AnonymousClass0WD r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1652
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A1P(X.0WA, X.0WD, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r12 == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1Q(com.facebook.rendercore.RenderTreeNode r10, java.lang.Object r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A1Q(com.facebook.rendercore.RenderTreeNode, java.lang.Object, boolean):void");
    }

    public static void A1R(Object obj) {
        if (!A0K) {
            try {
                A01 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            A0K = true;
        }
        Class cls = A01;
        if (cls != null) {
            if (!A0L) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    A07 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                A0L = true;
            }
            Field field = A07;
            if (field != null) {
                try {
                    LongSparseArray longSparseArray = (LongSparseArray) field.get(obj);
                    if (longSparseArray != null) {
                        longSparseArray.clear();
                    }
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
            }
        }
    }

    public static void A1S(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        String simpleName = cls.getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = cls.getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A1T(String str) {
        if (AnonymousClass0W2.A00 >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void A1U(String str, ActivityC004902h r5, Bundle bundle, Runnable runnable) {
        KeyguardManager keyguardManager;
        CharSequence charSequence;
        if (!(r5 instanceof DeviceCredentialHandlerActivity)) {
            Log.e(str, "Failed to check device credential. Parent handler not found.");
            return;
        }
        DeviceCredentialHandlerActivity deviceCredentialHandlerActivity = (DeviceCredentialHandlerActivity) r5;
        if (Build.VERSION.SDK_INT >= 23) {
            keyguardManager = (KeyguardManager) deviceCredentialHandlerActivity.getSystemService(KeyguardManager.class);
        } else {
            Object systemService = deviceCredentialHandlerActivity.getSystemService("keyguard");
            if (!(systemService instanceof KeyguardManager)) {
                Log.e(str, "Failed to check device credential. KeyguardManager not found.");
                deviceCredentialHandlerActivity.A0D(0);
                return;
            }
            keyguardManager = (KeyguardManager) systemService;
        }
        if (keyguardManager == null) {
            Log.e(str, "Failed to check device credential. KeyguardManager was null.");
            deviceCredentialHandlerActivity.A0D(0);
            return;
        }
        CharSequence charSequence2 = null;
        if (bundle != null) {
            charSequence2 = bundle.getCharSequence("title");
            charSequence = bundle.getCharSequence("subtitle");
        } else {
            charSequence = null;
        }
        Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(charSequence2, charSequence);
        if (createConfirmDeviceCredentialIntent == null) {
            Log.e(str, "Failed to check device credential. Got null intent from Keyguard.");
            deviceCredentialHandlerActivity.A0D(0);
            return;
        }
        AnonymousClass0WP r1 = AnonymousClass0WP.A09;
        if (r1 == null) {
            r1 = new AnonymousClass0WP();
            AnonymousClass0WP.A09 = r1;
        }
        r1.A08 = true;
        r1.A02 = 2;
        if (runnable != null) {
            runnable.run();
        }
        createConfirmDeviceCredentialIntent.setFlags(134742016);
        deviceCredentialHandlerActivity.startActivityForResult(createConfirmDeviceCredentialIntent, 0);
    }

    public static void A1V(Throwable th) {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        } else if (RuntimeException.class.isInstance(th)) {
            throw ((Throwable) RuntimeException.class.cast(th));
        }
    }

    public static void A1W(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static void A1X(XmlSerializer xmlSerializer, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            xmlSerializer.attribute(null, str, str2);
        }
    }

    public static void A1Y(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A1Z(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static boolean A1a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean A1c(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (!(i == i2 || (mode2 == 0 && mode == 0))) {
            float f = (float) i3;
            if (mode != 1073741824 || Math.abs(((float) size) - f) >= 0.5f) {
                if (mode == Integer.MIN_VALUE && mode2 == 0) {
                    if (((float) size) >= f) {
                        return true;
                    }
                    return false;
                } else if (mode2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || f > ((float) size)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A1d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r11.top >= r13.bottom) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r11.bottom <= r13.top) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1e(int r10, android.graphics.Rect r11, android.graphics.Rect r12, android.graphics.Rect r13) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A1e(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean A1f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A1g(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean A1h(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        } else if (viewParent instanceof AnonymousClass0W7) {
            return ((AnonymousClass0W7) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    public static boolean A1i(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        } else if (viewParent instanceof AnonymousClass0W7) {
            return ((AnonymousClass0W7) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean A1j(File file, Resources resources, int i) {
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return A1k(file, openRawResource);
        } finally {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                    throw th;
                } catch (IOException unused) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        if (r5 == null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1k(java.io.File r8, java.io.InputStream r9) {
        /*
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskWrites()
            r6 = 0
            r5 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0028 }
            r4.<init>(r8, r6)     // Catch:{ IOException -> 0x0028 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r1 = r9.read(r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r0 = -1
            if (r1 == r0) goto L_0x001a
            r4.write(r2, r6, r1)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r0 = 1
            r4.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r7)
            return r0
        L_0x0022:
            r0 = move-exception
            r5 = r4
            goto L_0x004f
        L_0x0025:
            r3 = move-exception
            r5 = r4
            goto L_0x0029
        L_0x0028:
            r3 = move-exception
        L_0x0029:
            java.lang.String r2 = "TypefaceCompatUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "Error copying resource contents to temp file: "
            r1.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x004c }
            r1.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004c }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x004c }
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            android.os.StrictMode.setThreadPolicy(r7)
            return r6
        L_0x004c:
            r0 = move-exception
            if (r5 == 0) goto L_0x0052
        L_0x004f:
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            android.os.StrictMode.setThreadPolicy(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A1k(java.io.File, java.io.InputStream):boolean");
    }

    public static boolean A1l(Set set) {
        return set.contains(AnonymousClass0WO.A04) || set.contains(AnonymousClass0WO.A05) || set.contains(AnonymousClass0WO.A06) || set.contains(AnonymousClass0WO.A07);
    }

    public static boolean A1m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean A1n(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() != 2 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean A1o(AnonymousClass0VJ[] r5, AnonymousClass0VJ[] r6) {
        int length;
        if (r5 == null || r6 == null || (length = r5.length) != r6.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!(r5[i].A00 == r6[i].A00 && r5[i].A01.length == r6[i].A01.length)) {
                return false;
            }
        }
        return true;
    }

    public static Drawable[] A1p(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00df A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0VJ[] A1q(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N2.A1q(java.lang.String):X.0VJ[]");
    }

    public static AnonymousClass0VJ[] A1r(AnonymousClass0VJ[] r5) {
        if (r5 == null) {
            return null;
        }
        int length = r5.length;
        AnonymousClass0VJ[] r3 = new AnonymousClass0VJ[length];
        for (int i = 0; i < length; i++) {
            r3[i] = new AnonymousClass0VJ(r5[i]);
        }
        return r3;
    }
}
