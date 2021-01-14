package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.URLUtil;
import androidx.fragment.app.DialogFragment;
import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import com.facebook.redex.ViewOnClickEBaseShape0S0400000_I0;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpRequestBase;

/* renamed from: X.05h  reason: invalid class name and case insensitive filesystem */
public class C008805h {
    public static AnonymousClass18V A00;
    public static AnonymousClass06E A01;
    public static ICameraUpdateFactoryDelegate A02;
    public static Method A03;
    public static boolean A04;

    public static boolean A1M(int i) {
        return i == 0 || !((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0);
    }

    public static byte A00(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }

    public static int A01(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < i) ? size : i;
    }

    public static int A02(Context context, float f) {
        return Math.round((f * ((float) context.getResources().getDisplayMetrics().densityDpi)) / 160.0f);
    }

    public static int A03(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int A04(AnonymousClass05j r10, boolean z) {
        int i;
        int i2;
        if (z) {
            i = r10.A00;
            i2 = r10.A01;
        } else {
            i = r10.A01;
            i2 = r10.A00;
        }
        byte[][] bArr = r10.A02;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    b = b2;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 = (i5 - 5) + 3 + i3;
            }
        }
        return i3;
    }

    public static int A05(List list, long j) {
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass05k r1 = (AnonymousClass05k) list.get(i);
            if (r1.A6l() != null && r1.A6l().longValue() == j) {
                return i;
            }
        }
        return -1;
    }

    public static ValueAnimator A06(View view, int i, Runnable runnable, long j) {
        int height = view.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(height, i);
        ofInt.addUpdateListener(new AnonymousClass189(view));
        ofInt.setInterpolator(new C06930Vg());
        int abs = Math.abs(height - i) >> 3;
        if (j == -1) {
            j = (long) abs;
        }
        ofInt.setDuration(j);
        ofInt.addListener(new AnonymousClass1KI(runnable));
        return ofInt;
    }

    public static Dialog A07(Activity activity, AnonymousClass02M r11, C02590Cr r12, C04360Kb r13, AnonymousClass01X r14, Collection collection, AnonymousClass1LP r16) {
        String A0A;
        if (collection == null || collection.isEmpty()) {
            Log.e("dialog/delete no statuses");
            return null;
        }
        if (collection.size() == 1) {
            A0A = r14.A06(R.string.delete_status_confirmation);
        } else {
            A0A = r14.A0A(R.plurals.delete_status_confirmation_multiple, (long) collection.size(), Integer.valueOf(collection.size()));
        }
        AnonymousClass0MB r3 = new AnonymousClass0MB(activity);
        AnonymousClass0MC r2 = r3.A01;
        r2.A0J = true;
        r2.A0E = C002001d.A1J(A0A, activity, r12);
        r3.A07(r14.A06(R.string.delete), new AnonymousClass18F(activity, r13, collection, r11, r14, r16));
        r3.A05(r14.A06(R.string.cancel), new AnonymousClass18E(activity));
        r2.A02 = new AnonymousClass18A(activity);
        return r3.A00();
    }

    public static ColorStateList A08(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A002;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A002 = AnonymousClass05p.A00(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A002;
    }

    public static Point A09(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager == null) {
            return point;
        }
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    public static PorterDuff.Mode A0A(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Drawable A0B(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable A012;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A012 = AnonymousClass05p.A01(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return A012;
    }

    public static Spannable A0C(List list, AnonymousClass05q r10, AbstractC008905s r11) {
        String str;
        Integer num;
        Context context = C009205v.A00().A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C009305w r7 = (C009305w) it.next();
                int length = spannableStringBuilder.length();
                AnonymousClass06T r0 = r7.A00;
                if (r0 != null) {
                    str = r0.A03;
                } else {
                    str = r7.A07;
                }
                spannableStringBuilder.append((CharSequence) str);
                int length2 = spannableStringBuilder.length();
                C009405x r02 = r7.A01;
                if (r02 != null) {
                    num = r02.A00(r10);
                } else {
                    num = r7.A04;
                    if (num == null) {
                        num = null;
                    }
                }
                if (num != null) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), length, length2, 0);
                }
                Float f = r7.A03;
                if (f != null) {
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, f.floatValue(), context.getResources().getDisplayMetrics())), length, length2, 0);
                }
                Integer num2 = r7.A05;
                if (num2 != null) {
                    spannableStringBuilder.setSpan(new StyleSpan(num2.intValue()), length, length2, 0);
                }
                AbstractC009505y r1 = r7.A02;
                if (r1 != null) {
                    spannableStringBuilder.setSpan(new C009605z(r1, r11, r10), length, length2, 0);
                }
                if (r7.A08) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), length, length2, 0);
                }
                String str2 = r7.A06;
                if (str2 != null) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(Typeface.create(str2, 0)), length, length2, 0);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static C04070Ix A0D() {
        Log.i("FingerprintHelper-helper/get-crypto-object");
        try {
            Signature instance = Signature.getInstance("SHA256withECDSA");
            KeyStore instance2 = KeyStore.getInstance("AndroidKeyStore");
            instance2.load(null);
            instance.initSign((PrivateKey) instance2.getKey("payment_bio_key_alias", null));
            return new C04070Ix(instance);
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            StringBuilder A0S = AnonymousClass008.A0S("FingerprintHelper/getCryptoObject: api=");
            A0S.append(Build.VERSION.SDK_INT);
            A0S.append(" error: ");
            A0S.append(e.toString());
            Log.e(A0S.toString());
            return null;
        }
    }

    public static AnonymousClass061 A0E(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return AnonymousClass061.STRETCH;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    return AnonymousClass061.BASELINE;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    return AnonymousClass061.CENTER;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    return AnonymousClass061.SPACE_AROUND;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    return AnonymousClass061.AUTO;
                }
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    return AnonymousClass061.FLEX_START;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    return AnonymousClass061.SPACE_BETWEEN;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    return AnonymousClass061.FLEX_END;
                }
                break;
        }
        throw new AnonymousClass060(AnonymousClass008.A0K("unknown flex align ", str));
    }

    public static AnonymousClass06A A0F(CameraPosition cameraPosition) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C001801b.A1R(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new AnonymousClass06A(iCameraUpdateFactoryDelegate.ACI(cameraPosition));
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public static AnonymousClass06A A0G(LatLng latLng) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C001801b.A1R(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new AnonymousClass06A(iCameraUpdateFactoryDelegate.ACK(latLng));
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public static AnonymousClass06A A0H(LatLng latLng, float f) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C001801b.A1R(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new AnonymousClass06A(iCameraUpdateFactoryDelegate.ACM(latLng, f));
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public static AnonymousClass06A A0I(LatLngBounds latLngBounds, int i) {
        try {
            ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = A02;
            C001801b.A1R(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
            return new AnonymousClass06A(iCameraUpdateFactoryDelegate.ACL(latLngBounds, i));
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public static AnonymousClass06F A0J(Bitmap bitmap) {
        try {
            AnonymousClass06E r1 = A01;
            C001801b.A1R(r1, "IBitmapDescriptorFactory is not initialized");
            return new AnonymousClass06F(r1.ARl(bitmap));
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public static C008505d A0K(String str, String str2) {
        AnonymousClass06G r6 = new AnonymousClass06G(str, str2);
        Class[] clsArr = new Class[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        C001801b.A1R(AnonymousClass06H.class, "Null interface");
        hashSet.add(AnonymousClass06H.class);
        for (int i = 0; i < 0; i++) {
            C001801b.A1R(clsArr[i], "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        AnonymousClass06I r9 = new AnonymousClass06I(r6);
        C001801b.A1R(r9, "Null factory");
        C001801b.A1b(true, "Missing required property: factory.");
        return new C008505d(new HashSet(hashSet), new HashSet(hashSet2), 0, 1, r9, hashSet3);
    }

    public static AbstractC009005t A0L(AbstractC009005t r7, AnonymousClass06J r8) {
        AbstractC009005t A0L;
        AbstractC009005t r6 = (AbstractC009005t) r8.A20(r7);
        List A4u = r6.A4u();
        for (int i = 0; i < A4u.size(); i++) {
            List list = (List) A4u.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if ((obj instanceof AbstractC009005t) && obj != (A0L = A0L((AbstractC009005t) obj, r8))) {
                    if (r6 == r7) {
                        r6 = r7.ABs();
                        A4u = r6.A4u();
                        list = (List) A4u.get(i);
                    }
                    list.set(i2, A0L);
                }
            }
        }
        return r6;
    }

    public static AnonymousClass06c A0M(AnonymousClass06K r4) {
        AnonymousClass06c r1 = new AnonymousClass06c();
        if (r4.ALy() != AnonymousClass06M.START_OBJECT) {
            r4.APz();
            return null;
        }
        while (r4.ACQ() != AnonymousClass06M.END_OBJECT) {
            String ALx = r4.ALx();
            r4.ACQ();
            if ("enabled".equals(ALx)) {
                r1.A03 = r4.ALz().A2L();
            } else if ("label".equals(ALx)) {
                r1.A01 = r4.ALz().ABL() ? null : r4.ALz().AQL();
            } else if ("role".equals(ALx)) {
                r1.A02 = r4.ALz().ABL() ? null : r4.ALz().AQL();
            } else if ("hint".equals(ALx)) {
                r1.A00 = r4.ALz().ABL() ? null : r4.ALz().AQL();
            } else if ("on_reflow".equals(ALx)) {
                ((AnonymousClass06d) r1).A00 = AnonymousClass06O.A00(r4.ALz());
            }
            r4.APz();
        }
        return r1;
    }

    public static AbstractC009505y A0N(AbstractC011306t r1) {
        C38191pT r12 = ((AnonymousClass27C) r1).A00;
        AbstractC009505y r0 = r12.A00;
        if (r0 != null) {
            return r0;
        }
        if (r12.A01 == null) {
            throw new IllegalStateException("The Lispy expression has not been parsed");
        }
        throw new IllegalStateException("The Lispy expression was parsed with the wrong environment");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static final AbstractC009505y A0O(AnonymousClass1H6 r8) {
        AbstractC009505y r2;
        long j;
        r8.A0A(AnonymousClass1H8.BEGIN_ARRAY);
        String A06 = r8.A06();
        switch (A06.hashCode()) {
            case -1507408260:
                if (A06.equals("bk.action.core.GetArg")) {
                    r2 = new C38171pR(r8.A01());
                    break;
                }
                r2 = new C38151pP(A06, A0m(r8));
                break;
            case -1163858448:
                if (A06.equals("bk.action.core.SetArg")) {
                    r2 = new C38201pU(r8.A01(), (AbstractC009505y) A0m(r8).get(0));
                    break;
                }
                r2 = new C38151pP(A06, A0m(r8));
                break;
            case -951380791:
                if (A06.equals("bk.action.i64.Const")) {
                    r8.A03();
                    AnonymousClass1H8 r1 = r8.A06;
                    if (r1 == AnonymousClass1H8.STRING || r1 == AnonymousClass1H8.NUMBER) {
                        try {
                            j = Long.parseLong(r8.A07);
                        } catch (NumberFormatException unused) {
                            String str = r8.A07;
                            double parseDouble = Double.parseDouble(str);
                            j = (long) parseDouble;
                            if (((double) j) != parseDouble) {
                                throw new NumberFormatException(str);
                            }
                        }
                        r8.A07();
                        r2 = new C463329c(j);
                        break;
                    } else {
                        StringBuilder A0S = AnonymousClass008.A0S("Expected a long but was ");
                        A0S.append(r1);
                        throw new IllegalStateException(A0S.toString());
                    }
                }
                r2 = new C38151pP(A06, A0m(r8));
                break;
            case 176015302:
                if (A06.equals("bk.action.f64.Const")) {
                    r2 = new C463229b(r8.A00());
                    break;
                }
                r2 = new C38151pP(A06, A0m(r8));
                break;
            case 506500643:
                if (A06.equals("bk.action.core.FuncConst")) {
                    AbstractC009505y r22 = (AbstractC009505y) A0m(r8).get(0);
                    if (r22 != null) {
                        r2 = new AnonymousClass27C(new C38191pT(null, r22, null));
                        break;
                    } else {
                        throw null;
                    }
                }
                r2 = new C38151pP(A06, A0m(r8));
                break;
            case 635115434:
                if (A06.equals("bk.action.i32.Const")) {
                    r2 = new C463229b((double) r8.A01());
                    break;
                }
                r2 = new C38151pP(A06, A0m(r8));
                break;
            case 1762511527:
                if (A06.equals("bk.action.f32.Const")) {
                    r2 = new C463229b((double) ((float) r8.A00()));
                    break;
                }
                r2 = new C38151pP(A06, A0m(r8));
                break;
            default:
                r2 = new C38151pP(A06, A0m(r8));
                break;
        }
        r8.A0A(AnonymousClass1H8.END_ARRAY);
        return r2;
    }

    public static AbstractC011306t A0P(AbstractC009505y r6, C010106g r7, AnonymousClass05q r8) {
        C37601oU r1;
        C010206h r2 = r8.A01;
        C010306i r4 = new C010306i(new int[]{0}, r2);
        Map map = r2.A06;
        C010706m r22 = ((AnonymousClass05r) r8).A01;
        AnonymousClass06P r12 = C010406j.A01.A00;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_global_bloks_host, r22);
        sparseArray.put(R.id.bloks_global_parser_map, r12);
        sparseArray.put(R.id.bloks_global_bloks_context, r8);
        sparseArray.put(R.id.bloks_interpreter_callback, r4);
        sparseArray.put(R.id.bloks_interpreter_variables, map);
        C010606l r0 = new C010606l(new C010506k());
        C42951xY r42 = r22.A03;
        if (r42 != null) {
            C010806n r23 = C010806n.A00;
            C010506k r02 = r0.A00;
            if (r02 == null) {
                r1 = new C37601oU(null, r23);
            } else if (r02 != null) {
                r1 = new C37601oU(r02, r23);
            } else {
                throw new IllegalStateException("MinScript is not enabled");
            }
            AbstractC011006p r03 = C009205v.A00().A03;
            if (r42 != null) {
                C011106q r24 = new C011106q(sparseArray, r1, r03);
                C010306i r13 = (C010306i) r24.A00.get(R.id.bloks_interpreter_callback);
                if (r13 != null) {
                    try {
                        r13.A01();
                    } catch (Throwable th) {
                        if (r13 != null) {
                            r13.A00();
                        }
                        throw th;
                    }
                }
                AbstractC011306t A0Q = A0Q(r6, r7, r24);
                if (r13 != null) {
                    r13.A00();
                }
                return A0Q;
            }
            throw null;
        }
        throw null;
    }

    /* JADX INFO: finally extract failed */
    public static AbstractC011306t A0Q(AbstractC009505y r13, C010106g r14, C011106q r15) {
        boolean z;
        AnonymousClass1HI r3;
        ByteBuffer doCompile;
        if (r13 instanceof C38191pT) {
            C38191pT r132 = (C38191pT) r13;
            C010906o r2 = r15.A01;
            if (!(r2 instanceof C37601oU)) {
                throw null;
            }
            C010806n r32 = ((C37601oU) r2).A01;
            if (r32 == null) {
                throw null;
            } else if (r32 != null) {
                if (0 != 0) {
                    r15 = new C011106q(r15.A00, r2, new C38161pQ(r15.A02));
                }
                if (r132 != null) {
                    try {
                        C010506k r33 = r2.A00;
                        boolean z2 = false;
                        if (r33 != null) {
                            z2 = true;
                        }
                        if (z2) {
                            if (r33 != null) {
                                RunnableEBaseShape0S0100000_I0_0 runnableEBaseShape0S0100000_I0_0 = new RunnableEBaseShape0S0100000_I0_0(r2, 24);
                                if (r132.A01 == null) {
                                    if (r132.A00 == null) {
                                        String str = r132.A02;
                                        if (str.startsWith("kpaRj")) {
                                            doCompile = ByteBuffer.wrap(Base64.decode(str, 0));
                                        } else {
                                            runnableEBaseShape0S0100000_I0_0.run();
                                            doCompile = MinsCompilerImpl$Helper.doCompile(str);
                                        }
                                        doCompile.order(ByteOrder.nativeOrder());
                                        ByteBuffer slice = doCompile.slice();
                                        slice.order(doCompile.order());
                                        int capacity = doCompile.capacity();
                                        slice.getInt();
                                        slice.getShort();
                                        slice.getShort();
                                        int i = slice.getInt();
                                        int i2 = slice.getInt();
                                        int position = doCompile.position();
                                        if (i > capacity) {
                                            StringBuilder A0U = AnonymousClass008.A0U("buffer is smaller than encoded size ", i, " ", capacity, " byteBuffer.order:");
                                            A0U.append(doCompile.order());
                                            A0U.append(" native order:");
                                            A0U.append(ByteOrder.nativeOrder());
                                            throw new AnonymousClass1HF(A0U.toString());
                                        } else if (i >= position) {
                                            int i3 = (i2 << 4) + position;
                                            if (i3 <= i) {
                                                AnonymousClass1HB[] r5 = new AnonymousClass1HB[i2];
                                                for (int i4 = 0; i4 < i2; i4++) {
                                                    AnonymousClass1HB r7 = new AnonymousClass1HB();
                                                    r7.A00 = slice.getInt();
                                                    r7.A02 = slice.getInt();
                                                    r7.A01 = slice.getInt();
                                                    slice.getInt();
                                                    int i5 = r7.A02;
                                                    if (i5 % 4 == 0) {
                                                        int i6 = r7.A01;
                                                        if (i3 > i5 || i5 + i6 > i) {
                                                            throw new AnonymousClass1HF(String.format("section index %d kind %d invalid offset/size", Integer.valueOf(i4), Integer.valueOf(r7.A00)));
                                                        }
                                                        r5[i4] = r7;
                                                    } else {
                                                        throw new AnonymousClass1HF(String.format("section index %d kind %d invalid alignment", Integer.valueOf(i4), Integer.valueOf(r7.A00)));
                                                    }
                                                }
                                                if (i2 >= 4) {
                                                    int i7 = 0;
                                                    while (r5[i7].A00 == i7) {
                                                        i7++;
                                                        if (i7 >= 4) {
                                                            r132.A01 = new AnonymousClass1HE(new AnonymousClass1HC(slice, r5, new AtomicReferenceArray(r5[0].A01 >> 4), new AtomicReferenceArray(r5[1].A01 >> 4)).A01(0), null);
                                                        }
                                                    }
                                                    throw new AnonymousClass1HF(AnonymousClass008.A0F("missing required section ", i7));
                                                }
                                                throw new AnonymousClass1HF("less than required number of sections");
                                            }
                                            throw new AnonymousClass1HF("encoded size not enough for section headers");
                                        } else {
                                            throw new AnonymousClass1HF("encoded size is too small");
                                        }
                                    } else {
                                        throw new IllegalStateException("The Lispy expression has already been parsed in a different environment");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("MinScript is not enabled");
                            }
                        } else if (r132.A00 == null) {
                            if (r132.A01 == null) {
                                AnonymousClass1H6 r1 = new AnonymousClass1H6(new StringReader(r132.A02));
                                r1.A08 = true;
                                try {
                                    r132.A00 = A0O(r1);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            } else {
                                throw new IllegalStateException("The Lispy expression has already been parsed in a different environment");
                            }
                        }
                        if (!(r2 instanceof C37601oU)) {
                            throw null;
                        } else if (((C37601oU) r2).A01 == null) {
                            throw null;
                        } else if (r2.A00 != null) {
                            AnonymousClass1HE r4 = r132.A01;
                            if (r4 != null) {
                                List<Object> unmodifiableList = Collections.unmodifiableList(r14.A00);
                                if (AnonymousClass1H4.A00.get() == null) {
                                    z = true;
                                    r3 = new AnonymousClass1HI();
                                    AnonymousClass1H4.A00.set(r3);
                                } else {
                                    z = false;
                                    r3 = (AnonymousClass1HI) AnonymousClass1H4.A00.get();
                                }
                                try {
                                    C38181pS r6 = new C38181pS(r15);
                                    int i8 = r3.A01;
                                    r3.A0D(unmodifiableList.size() + 1 + 5);
                                    AbstractC011306t r72 = AnonymousClass1H5.A00;
                                    Object[] objArr = r3.A04;
                                    int i9 = r3.A01;
                                    objArr[i9] = r72;
                                    r3.A01 = i9 + 1;
                                    for (Object obj : unmodifiableList) {
                                        r3.A0F(obj);
                                    }
                                    r3.A0G(new AnonymousClass27C(new C38191pT(null, null, r4)), unmodifiableList.size(), r72, 0);
                                    C38181pS r12 = r3.A02;
                                    r3.A02 = r6;
                                    try {
                                        r3.A09();
                                        r3.A02 = r12;
                                        Object A06 = r3.A06(0);
                                        r3.A0A();
                                        int i10 = r3.A01;
                                        if (i10 == i8) {
                                            return (AbstractC011306t) A06;
                                        }
                                        throw new AnonymousClass1HF(AnonymousClass008.A0K("InvalidBytecode: ", String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", Integer.valueOf(i10), Integer.valueOf(i8))));
                                    } catch (Throwable th) {
                                        r3.A02 = r12;
                                        throw th;
                                    }
                                } finally {
                                    if (z) {
                                        AnonymousClass1H4.A00.remove();
                                    }
                                }
                            } else if (r132.A00 == null) {
                                throw new IllegalStateException("The Lispy expression has not been parsed");
                            } else {
                                throw new IllegalStateException("The Lispy expression was parsed with the wrong environment");
                            }
                        } else {
                            AbstractC009505y r0 = r132.A00;
                            if (r0 != null) {
                                AbstractC011306t A0R = A0R(r0, r14, r15);
                                r2.A00();
                                return A0R;
                            } else if (r132.A01 == null) {
                                throw new IllegalStateException("The Lispy expression has not been parsed");
                            } else {
                                throw new IllegalStateException("The Lispy expression was parsed with the wrong environment");
                            }
                        }
                    } finally {
                        r2.A00();
                    }
                } else {
                    throw new RuntimeException("ensureParsed expects OpaqueExpression");
                }
            } else {
                throw null;
            }
        } else {
            throw new RuntimeException("Interpreter.evaluate expects OpaqueExpression");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v68, resolved type: X.05y[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v51, resolved type: X.06t[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0247, code lost:
        if (r6.equals("bk.action.i64.Gt") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0253, code lost:
        if (r6.equals("bk.action.i64.Eq") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x025f, code lost:
        if (r6.equals("bk.action.i32.Or") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026b, code lost:
        if (r6.equals("bk.action.i32.Lt") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0277, code lost:
        if (r6.equals("bk.action.i32.Gt") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0283, code lost:
        if (r6.equals("bk.action.i32.Eq") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028e, code lost:
        if (r6.equals("bk.action.f32.Lt") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x029a, code lost:
        if (r6.equals("bk.action.f32.Gt") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a5, code lost:
        if (r6.equals("bk.action.f32.Eq") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b1, code lost:
        if (r6.equals("bk.action.array.Remove") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02bd, code lost:
        if (r6.equals("bk.action.array.Length") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c9, code lost:
        if (r6.equals("bk.action.f32.Sqrt") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d5, code lost:
        if (r6.equals("bk.action.array.Append") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02df, code lost:
        if (r6.equals("bk.action.function.BindWithArrayV2.ApplyWithArray") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (r6.equals("bk.action.core.Default") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (r6.equals("bk.action.internal.EngineDescription") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (r6.equals("bk.action.f32.Sub") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r6.equals("bk.action.f32.Mul") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (r6.equals("bk.action.f32.Div") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        if (r6.equals("bk.action.f32.Add") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r6.equals("bk.action.f32.Convert") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (r6.equals("bk.action.map.Update") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        if (r6.equals("bk.action.map.Make") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        if (r6.equals("bk.action.array.Make") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        if (r6.equals("bk.action.map.Get") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        if (r6.equals("bk.action.i64.Convert") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ed, code lost:
        if (r6.equals("bk.action.core.TakeLast") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        if (r6.equals("bk.action.i32.Convert") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0105, code lost:
        if (r6.equals("bk.action.i64.Sub") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        if (r6.equals("bk.action.i64.Mul") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011d, code lost:
        if (r6.equals("bk.action.i64.Div") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        if (r6.equals("bk.action.i64.Add") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0135, code lost:
        if (r6.equals("bk.action.i32.Sub") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        if (r6.equals("bk.action.i32.Mul") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014d, code lost:
        if (r6.equals("bk.action.i32.Mod") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0159, code lost:
        if (r6.equals("bk.action.i32.Div") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0165, code lost:
        if (r6.equals("bk.action.i32.And") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0171, code lost:
        if (r6.equals("bk.action.i32.Add") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017d, code lost:
        if (r6.equals("bk.action.string.Length") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0189, code lost:
        if (r6.equals("bk.action.function.BindWithArrayV2") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0195, code lost:
        if (r6.equals("bk.action.string.Concat") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a1, code lost:
        if (r6.equals("bk.action.core.Pattern") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ad, code lost:
        if (r6.equals("bk.action.string.AsInteger") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b9, code lost:
        if (r6.equals("bk.action.string.ValueOfNumber") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c3, code lost:
        if (r6.equals("bk.action.function.BindWithArrayV2.LoadArgs") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cf, code lost:
        if (r6.equals("bk.action.string.Replace") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01db, code lost:
        if (r6.equals("bk.action.core.While") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e7, code lost:
        if (r6.equals("bk.action.core.Match") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f3, code lost:
        if (r6.equals("bk.action.core.Apply") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ff, code lost:
        if (r6.equals("bk.action.i32.Rand") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020b, code lost:
        if (r6.equals("bk.action.map.UpdateAndGet") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0217, code lost:
        if (r6.equals("bk.action.array.Put") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0223, code lost:
        if (r6.equals("bk.action.array.Get") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022f, code lost:
        if (r6.equals("bk.action.array.Update") == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023b, code lost:
        if (r6.equals("bk.action.i64.Lt") == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AbstractC011306t A0R(X.AbstractC009505y r12, X.C010106g r13, X.C011106q r14) {
        /*
        // Method dump skipped, instructions count: 2918
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008805h.A0R(X.05y, X.06g, X.06q):X.06t");
    }

    public static AbstractC011306t A0S(Object obj) {
        if (obj == null) {
            return AnonymousClass1H5.A00;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Long) {
                return new C463329c(number.longValue());
            }
            return new C463229b(number.doubleValue());
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                arrayList.add(A0S(obj2));
            }
            return A0T(arrayList);
        } else if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                hashMap.put(A0S(entry.getKey()), A0S(entry.getValue()));
            }
            return A0T(hashMap);
        } else if (!(obj instanceof AnonymousClass27G)) {
            return A0T(obj);
        } else {
            throw new IllegalArgumentException("object should not be wrapped multiple times");
        }
    }

    public static AbstractC011306t A0T(Object obj) {
        if (obj == null) {
            return AnonymousClass1H5.A00;
        }
        if (!(obj instanceof AnonymousClass27G)) {
            return new AnonymousClass27G(obj);
        }
        throw new IllegalStateException("object should not be wrapped multiple times");
    }

    public static AnonymousClass1HE A0U(Object obj) {
        C38191pT r1 = ((AnonymousClass27C) obj).A00;
        AnonymousClass1HE r0 = r1.A01;
        if (r0 != null) {
            return r0;
        }
        if (r1.A00 == null) {
            throw new IllegalStateException("The Lispy expression has not been parsed");
        }
        throw new IllegalStateException("The Lispy expression was parsed with the wrong environment");
    }

    public static Boolean A0V(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static Integer A0W(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1901805651) {
            if (hashCode != 3178655) {
                if (hashCode == 466743410 && str.equals("visible")) {
                    return 0;
                }
            } else if (str.equals("gone")) {
                return 8;
            }
        } else if (str.equals("invisible")) {
            return 4;
        }
        throw new AnonymousClass060(AnonymousClass008.A0K("unknown visibility ", str));
    }

    public static Object A0X(AbstractC011406u r3) {
        Exception exc;
        if (r3.A04()) {
            return r3.A03();
        }
        if (((C011506v) r3).A05) {
            throw new CancellationException("Task is already canceled");
        }
        C011506v r32 = (C011506v) r3;
        synchronized (r32.A04) {
            exc = r32.A00;
        }
        throw new ExecutionException(exc);
    }

    public static Object A0Y(AbstractC011406u r2, long j, TimeUnit timeUnit) {
        boolean z;
        C001801b.A1U("Must not be called on the main application thread");
        C001801b.A1R(r2, "Task must not be null");
        C001801b.A1R(timeUnit, "TimeUnit must not be null");
        C011506v r0 = (C011506v) r2;
        synchronized (r0.A04) {
            z = r0.A02;
        }
        if (z) {
            return A0X(r2);
        }
        C011606w r1 = new C011606w();
        Executor executor = AnonymousClass070.A01;
        r2.A02(executor, r1);
        r2.A01(executor, r1);
        r2.A00(executor, r1);
        if (r1.A00.await(j, timeUnit)) {
            return A0X(r2);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Object A0Z(AnonymousClass06K r3) {
        AnonymousClass06M ALy = r3.ALy();
        if (ALy == AnonymousClass06M.START_OBJECT) {
            return A0p(r3);
        }
        AnonymousClass06M r0 = AnonymousClass06M.START_ARRAY;
        if (ALy == r0) {
            ArrayList arrayList = new ArrayList();
            if (ALy == r0) {
                while (r3.ACQ() != AnonymousClass06M.END_ARRAY) {
                    arrayList.add(A0Z(r3));
                }
            }
            return arrayList;
        } else if (ALy == AnonymousClass06M.NULL) {
            return null;
        } else {
            if (ALy == AnonymousClass06M.BOOLEAN) {
                return AnonymousClass008.A04(r3);
            }
            if (ALy == AnonymousClass06M.NUMBER) {
                Number ACW = r3.ALz().ACW();
                if (ACW instanceof Long) {
                    return Long.valueOf(ACW.longValue());
                }
                return Double.valueOf(ACW.doubleValue());
            } else if (ALy == AnonymousClass06M.STRING) {
                return r3.ALz().AQL();
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("unsupported token type ");
                A0S.append(ALy);
                throw new IllegalStateException(A0S.toString());
            }
        }
    }

    public static Object A0a(AbstractC011306t r1) {
        if (r1 == AnonymousClass1H5.A00) {
            return null;
        }
        return ((AnonymousClass27G) r1).A00;
    }

    public static Object A0b(AbstractC011306t r1) {
        if (r1 == AnonymousClass1H5.A00) {
            return null;
        }
        return ((AnonymousClass27G) r1).A00;
    }

    public static Object A0c(Object obj) {
        if (!(obj instanceof AbstractC011306t)) {
            return obj;
        }
        if (obj == AnonymousClass1H5.A00) {
            return null;
        }
        if (obj instanceof AnonymousClass27D) {
            return obj;
        }
        if (obj instanceof AnonymousClass27G) {
            Object obj2 = ((AnonymousClass27G) obj).A00;
            if (obj2 instanceof List) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    arrayList.add(A0c(obj3));
                }
                return arrayList;
            } else if (!(obj2 instanceof Map)) {
                return obj2;
            } else {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    hashMap.put(A0c(entry.getKey()), A0c(entry.getValue()));
                }
                return hashMap;
            }
        } else {
            throw new IllegalArgumentException("Cannot unwrap this Value type");
        }
    }

    /* JADX INFO: finally extract failed */
    public static Object A0d(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public static String A0e(PowerManager.WakeLock wakeLock) {
        String str = null;
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(null)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String A0f(AnonymousClass071 r6) {
        int length = ((AnonymousClass072) r6).bytes.length;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            byte b = ((AnonymousClass072) r6).bytes[i];
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String A0g(AnonymousClass09E r0, AnonymousClass01X r1) {
        if (r0.A04() == 0) {
            return r1.A06(R.string.status_media_privacy_contacts);
        }
        return r1.A06(R.string.status_media_privacy_custom);
    }

    public static String A0h(Object obj) {
        return (String) A0a((AnonymousClass27G) obj);
    }

    public static String A0i(String str) {
        return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? str : AnonymousClass008.A0K("https://", str);
    }

    public static final String A0j(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static PublicKey A0k() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            instance.initialize(new KeyGenParameterSpec.Builder("payment_bio_key_alias", 4).setDigests("SHA-256").setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true).build());
            return instance.generateKeyPair().getPublic();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            StringBuilder A0S = AnonymousClass008.A0S("FingerprintHelper/generateKey generateKey: api=");
            A0S.append(Build.VERSION.SDK_INT);
            throw new RuntimeException(A0S.toString(), e);
        }
    }

    public static ArrayList A0l(AbstractC011306t r3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A0b(r3)).iterator();
        while (it.hasNext()) {
            arrayList.add(A0b((AbstractC011306t) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList A0m(AnonymousClass1H6 r5) {
        AnonymousClass1H8 r4 = AnonymousClass1H8.NULL;
        AnonymousClass1H8 r3 = AnonymousClass1H8.END_ARRAY;
        ArrayList arrayList = new ArrayList();
        while (true) {
            r5.A03();
            if (r5.A06 == r3) {
                break;
            } else if (r5.A03() == AnonymousClass1H8.STRING) {
                arrayList.add(A0T(r5.A06()));
            } else if (r5.A03() == r4) {
                arrayList.add(AnonymousClass1H5.A00);
                r5.A03();
                AnonymousClass1H8 r1 = r5.A06;
                if (r1 == r4) {
                    r5.A07();
                } else {
                    StringBuilder A0S = AnonymousClass008.A0S("Expected null but was ");
                    A0S.append(r1);
                    throw new IllegalStateException(A0S.toString());
                }
            } else if (r5.A03() == AnonymousClass1H8.BEGIN_ARRAY) {
                arrayList.add(A0O(r5));
            } else if (r5.A03() != r3) {
                StringBuilder A0S2 = AnonymousClass008.A0S("unexpected token");
                A0S2.append(r5.A03());
                throw new IOException(A0S2.toString());
            }
        }
        return arrayList;
    }

    public static List A0n(Object obj) {
        return (List) A0a((AnonymousClass27G) obj);
    }

    public static List A0o(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            AnonymousClass05n r2 = (AnonymousClass05n) list.get(i);
            if (r2 != null) {
                if (r2 instanceof AnonymousClass06X) {
                    AnonymousClass06X r22 = (AnonymousClass06X) r2;
                    for (int i2 = 0; i2 < r22.A00.size(); i2++) {
                        arrayList.add(r22.A00.get(i2));
                    }
                } else {
                    arrayList.add(r2);
                }
            }
        }
        return arrayList;
    }

    public static Map A0p(AnonymousClass06K r3) {
        if (r3.ALy() != AnonymousClass06M.START_OBJECT) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (r3.ACQ() != AnonymousClass06M.END_OBJECT) {
            String ALx = r3.ALx();
            r3.ACQ();
            hashMap.put(ALx, A0Z(r3));
        }
        return hashMap;
    }

    public static void A0q(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void A0r(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void A0s(Parcel parcel, int i, byte b) {
        A0v(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void A0t(Parcel parcel, int i, float f) {
        A0v(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void A0u(Parcel parcel, int i, int i2) {
        A0v(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void A0v(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    public static void A0w(Parcel parcel, int i, long j) {
        A0v(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void A0x(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int A032 = A03(parcel, i);
            parcel.writeBundle(bundle);
            A0r(parcel, A032);
        }
    }

    public static void A0y(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int A032 = A03(parcel, i);
            parcel.writeStrongBinder(iBinder);
            A0r(parcel, A032);
        }
    }

    public static void A0z(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int A032 = A03(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            A0r(parcel, A032);
        } else if (z) {
            A0v(parcel, i, 0);
        }
    }

    public static void A10(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int A032 = A03(parcel, i);
            parcel.writeString(str);
            A0r(parcel, A032);
        } else if (z) {
            A0v(parcel, i, 0);
        }
    }

    public static void A11(Parcel parcel, int i, List list) {
        if (list != null) {
            int A032 = A03(parcel, i);
            parcel.writeStringList(list);
            A0r(parcel, A032);
        }
    }

    public static void A12(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int A032 = A03(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            A0r(parcel, A032);
        } else if (z) {
            A0v(parcel, i, 0);
        }
    }

    public static void A13(Parcel parcel, int i, boolean z) {
        A0v(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A14(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int A032 = A03(parcel, i);
            parcel.writeByteArray(bArr);
            A0r(parcel, A032);
        } else if (z) {
            A0v(parcel, i, 0);
        }
    }

    public static void A15(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int A032 = A03(parcel, i);
            int length = parcelableArr.length;
            parcel.writeInt(length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i2);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            A0r(parcel, A032);
        }
    }

    public static void A16(View view, boolean z, boolean z2) {
        if (z) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                if (z2) {
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration(125);
                    scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                    scaleAnimation.setFillBefore(true);
                    view.startAnimation(scaleAnimation);
                }
            }
        } else if (view.getVisibility() == 0) {
            if (z2) {
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(125);
                scaleAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation2.setFillBefore(true);
                view.startAnimation(scaleAnimation2);
            }
            view.setVisibility(4);
        }
    }

    public static void A17(AnonymousClass037 r3, DialogFragment dialogFragment) {
        if (!r3.A0W) {
            AnonymousClass0LW A0C = r3.A0C();
            String name = dialogFragment.getClass().getName();
            if (A0C.A0Q.A01(name) == null) {
                dialogFragment.A0u(r3.A0C(), name);
            }
        }
    }

    public static void A18(AnonymousClass074 r3, Integer num) {
        AnonymousClass075 r2 = AnonymousClass075.TEXT_START;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                r2 = AnonymousClass075.CENTER;
            } else if (intValue != 8388611 && intValue == 8388613) {
                r2 = AnonymousClass075.TEXT_END;
            }
            r3.A0R = r2;
        }
    }

    public static void A19(AnonymousClass076 r12, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        Method[] declaredMethods = r12.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String replaceFirst = ((String) it.next()).replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceFirst.substring(0, 1).toLowerCase());
                sb2.append(replaceFirst.substring(1, replaceFirst.length() - 4));
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("get");
                sb3.append(replaceFirst);
                Method method2 = (Method) hashMap.get(sb3.toString());
                if (method2 != null) {
                    A1G(sb, i, A0j(obj), AnonymousClass078.A05(method2, r12, new Object[0]));
                }
            }
            StringBuilder sb4 = new StringBuilder("set");
            sb4.append(replaceFirst);
            if (hashMap2.get(sb4.toString()) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    StringBuilder A0S = AnonymousClass008.A0S("get");
                    A0S.append(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(A0S.toString())) {
                    }
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(replaceFirst.substring(0, 1).toLowerCase());
                sb5.append(replaceFirst.substring(1));
                String obj2 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("get");
                sb6.append(replaceFirst);
                Method method3 = (Method) hashMap.get(sb6.toString());
                StringBuilder sb7 = new StringBuilder("has");
                sb7.append(replaceFirst);
                Method method4 = (Method) hashMap.get(sb7.toString());
                if (method3 != null) {
                    Object A05 = AnonymousClass078.A05(method3, r12, new Object[0]);
                    if (method4 == null) {
                        if (A05 instanceof Boolean) {
                            equals = !((Boolean) A05).booleanValue();
                        } else if (A05 instanceof Integer) {
                            if (((Number) A05).intValue() == 0) {
                            }
                        } else if (A05 instanceof Float) {
                            if (((Number) A05).floatValue() == 0.0f) {
                            }
                        } else if (A05 instanceof Double) {
                            if (((Number) A05).doubleValue() == 0.0d) {
                            }
                        } else if (A05 instanceof String) {
                            equals = A05.equals("");
                        } else if (A05 instanceof AnonymousClass071) {
                            equals = A05.equals(AnonymousClass071.A01);
                        } else if (A05 instanceof AnonymousClass076) {
                            if (A05 == ((AnonymousClass077) A05).A61()) {
                            }
                        } else if ((A05 instanceof Enum) && ((Enum) A05).ordinal() == 0) {
                        }
                        if (equals) {
                        }
                    } else if (!((Boolean) AnonymousClass078.A05(method4, r12, new Object[0])).booleanValue()) {
                    }
                    A1G(sb, i, A0j(obj2), A05);
                }
            }
        }
        AnonymousClass07A r2 = ((AnonymousClass078) r12).unknownFields;
        if (r2 != null) {
            for (int i2 = 0; i2 < r2.count; i2++) {
                A1G(sb, i, String.valueOf(r2.A02[i2] >>> 3), r2.A03[i2]);
            }
        }
    }

    public static void A1A(AnonymousClass07C r3, String str, AnonymousClass06K r5, AnonymousClass06P r6) {
        if ("children".equals(str)) {
            ArrayList arrayList = null;
            if (r5.ALy() == AnonymousClass06M.START_ARRAY) {
                arrayList = new ArrayList();
                while (r5.ACQ() != AnonymousClass06M.END_ARRAY) {
                    AnonymousClass05n A08 = AnonymousClass05i.A08(r5, r6);
                    if (A08 != null) {
                        arrayList.add(A08);
                    }
                }
            }
            r3.A00 = arrayList;
            return;
        }
        A1P(r3, str, r5, r6);
    }

    public static void A1B(AbstractC009505y r6, C010106g r7, C010706m r8, AnonymousClass06P r9) {
        C37601oU r2;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_global_bloks_host, r8);
        sparseArray.put(R.id.bloks_global_parser_map, r9);
        C010606l r0 = new C010606l(new C010506k());
        C42951xY r4 = r8.A03;
        if (r4 != null) {
            C010806n r1 = C010806n.A00;
            C010506k r02 = r0.A00;
            if (r02 == null) {
                r2 = new C37601oU(null, r1);
            } else if (r02 != null) {
                r2 = new C37601oU(r02, r1);
            } else {
                throw new IllegalStateException("MinScript is not enabled");
            }
            AbstractC011006p r12 = C009205v.A00().A03;
            if (r4 != null) {
                A0Q(r6, r7, new C011106q(sparseArray, r2, r12));
                return;
            }
            throw null;
        }
        throw null;
    }

    public static void A1C(C02780Dk r10, AnonymousClass00Y r11, BusinessProfileFieldView businessProfileFieldView, int i, AnonymousClass01X r14) {
        boolean z;
        String str;
        if (businessProfileFieldView.A06 != null) {
            businessProfileFieldView.A06.setTextColor(C004302a.A00(businessProfileFieldView.getContext(), R.color.business_profile_link));
            if (i == 0) {
                String text = businessProfileFieldView.getText();
                if (!TextUtils.isEmpty(text)) {
                    String A0i = A0i(text);
                    if (!(businessProfileFieldView.getText() == null || businessProfileFieldView.A06 == null || businessProfileFieldView.A05 == null)) {
                        boolean A1V = A1V(businessProfileFieldView.getText());
                        Uri parse = Uri.parse(A0i(businessProfileFieldView.getText()));
                        if (!(!A1V || parse == null || parse.getPathSegments().size() == 0)) {
                            int i2 = R.drawable.ic_business_instagram;
                            if (!A1V) {
                                i2 = R.drawable.ic_business_link;
                            }
                            businessProfileFieldView.setIcon(i2);
                            if (!A1V) {
                                if (!A1V) {
                                    str = "";
                                }
                                str = parse.getPathSegments().get(0);
                            } else {
                                businessProfileFieldView.setText(r14.A06(R.string.business_details_subtitle_instagram), null);
                                str = parse.getPathSegments().get(0);
                            }
                            businessProfileFieldView.setSubText(str);
                            int A002 = C004302a.A00(businessProfileFieldView.getContext(), R.color.body_gray);
                            int A003 = C004302a.A00(businessProfileFieldView.getContext(), R.color.list_item_info);
                            businessProfileFieldView.A06.setTextColor(A002);
                            businessProfileFieldView.A05.setTextColor(A003);
                            z = true;
                            StringBuilder A0S = AnonymousClass008.A0S("https://l.wl.co/l?u=");
                            A0S.append(Uri.encode(A0i));
                            businessProfileFieldView.setOnClickListener(new AnonymousClass18D(z, r11, r10, businessProfileFieldView, Uri.parse(A0S.toString())));
                        }
                    }
                    z = false;
                    StringBuilder A0S2 = AnonymousClass008.A0S("https://l.wl.co/l?u=");
                    A0S2.append(Uri.encode(A0i));
                    businessProfileFieldView.setOnClickListener(new AnonymousClass18D(z, r11, r10, businessProfileFieldView, Uri.parse(A0S2.toString())));
                }
            } else if (i == 1) {
                String text2 = businessProfileFieldView.getText();
                if (!TextUtils.isEmpty(text2)) {
                    StringBuilder sb = new StringBuilder("mailto:");
                    sb.append(text2);
                    businessProfileFieldView.setOnClickListener(new ViewOnClickEBaseShape0S0400000_I0(r11, r10, businessProfileFieldView, Uri.parse(sb.toString()), 1));
                }
            } else if (i == 2) {
                String text3 = businessProfileFieldView.getText();
                if (!TextUtils.isEmpty(text3)) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("geo:0,0?q=");
                    A0S3.append(Uri.encode(text3));
                    businessProfileFieldView.setOnClickListener(new ViewOnClickEBaseShape0S0400000_I0(r11, r10, businessProfileFieldView, new Intent("android.intent.action.VIEW", Uri.parse(A0S3.toString())), 0));
                }
            }
        }
    }

    public static void A1D(AbstractC41351ut r2) {
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-util/log-response ");
        A0S.append(r2.A2o());
        A0S.append(" ");
        A0S.append(r2.A8o());
        Log.d(A0S.toString());
    }

    public static void A1E(AnonymousClass03P r5) {
        Vibrator vibrator = r5.A0B;
        if (vibrator == null) {
            vibrator = (Vibrator) r5.A0H.A00.getSystemService("vibrator");
            r5.A0B = vibrator;
        }
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(30, 48));
        } else {
            vibrator.vibrate(30);
        }
    }

    public static void A1F(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            bundle.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            android.util.Log.d("FirebaseMessaging", AnonymousClass008.A09(valueOf.length() + str.length() + 22, "Sending event=", str, " params=", valueOf));
        }
        AnonymousClass05T A002 = AnonymousClass05T.A00();
        A002.A03();
        A002.A03.A02(AnonymousClass07D.class);
        android.util.Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }

    public static final void A1G(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                A1G(sb, i, str, obj2);
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(A0f(new AnonymousClass072(((String) obj).getBytes(AnonymousClass07G.A00))));
            sb.append('\"');
        } else if (obj instanceof AnonymousClass071) {
            sb.append(": \"");
            sb.append(A0f((AnonymousClass071) obj));
            sb.append('\"');
        } else if (obj instanceof AnonymousClass078) {
            sb.append(" {");
            A19((AnonymousClass079) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    public static void A1H(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
        }
        sb.append("}");
    }

    public static void A1I(HttpURLConnection httpURLConnection) {
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-util/log-response ");
        A0S.append(httpURLConnection.getResponseCode());
        A0S.append(" ");
        A0S.append(httpURLConnection.getResponseMessage());
        Log.d(A0S.toString());
    }

    public static void A1J(HttpEntity httpEntity) {
        if (httpEntity != null) {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                Log.e("gdrive-api/consume-entity", e);
            }
        }
    }

    public static void A1K(HttpRequestBase httpRequestBase) {
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-util/log-request ");
        A0S.append(httpRequestBase.getRequestLine());
        Log.d(A0S.toString());
    }

    public static boolean A1L() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean A1N(int i, int i2, int i3) {
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

    public static boolean A1O(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static boolean A1P(AbstractC008905s r5, String str, AnonymousClass06K r7, AnonymousClass06P r8) {
        if ("_style".equals(str)) {
            r5.A01 = AnonymousClass05i.A08(r7, r8);
            return true;
        } else if ("on_reflow".equals(str)) {
            r5.A03 = AnonymousClass06O.A00(r7.ALz());
            return true;
        } else if ("on_bind".equals(str)) {
            r5.A02 = AnonymousClass06O.A00(r7.ALz());
            return true;
        } else if ("extensions".equals(str)) {
            ArrayList arrayList = null;
            if (r7.ALy() == AnonymousClass06M.START_ARRAY) {
                arrayList = new ArrayList();
                while (r7.ACQ() != AnonymousClass06M.END_ARRAY) {
                    AnonymousClass05n A08 = AnonymousClass05i.A08(r7, r8);
                    if (A08 != null) {
                        arrayList.add(A08);
                    }
                }
            }
            r5.A06 = arrayList;
            return true;
        } else if ("id".equals(str)) {
            r5.A04 = Long.valueOf(r7.ALz().ABp());
            return true;
        } else if ("scaleX".equals(str)) {
            r5.A00.A02 = (float) r7.ALz().A3t();
            return true;
        } else if ("scaleY".equals(str)) {
            r5.A00.A03 = (float) r7.ALz().A3t();
            return true;
        } else if ("rotation".equals(str)) {
            r5.A00.A01 = (float) r7.ALz().A3t();
            return true;
        } else if ("alpha".equals(str)) {
            r5.A00.A00 = (float) r7.ALz().A3t();
            return true;
        } else if ("translationX".equals(str)) {
            r5.A00.A04 = (float) r7.ALz().A3t();
            return true;
        } else if ("translationY".equals(str)) {
            r5.A00.A05 = (float) r7.ALz().A3t();
            return true;
        } else if (!"translationZ".equals(str)) {
            return false;
        } else {
            r5.A00.A06 = (float) r7.ALz().A3t();
            return true;
        }
    }

    public static boolean A1Q(Number number) {
        return number.intValue() != 0;
    }

    public static boolean A1R(Object obj) {
        return (obj instanceof AnonymousClass27G) && (A0a((AnonymousClass27G) obj) instanceof List);
    }

    public static boolean A1S(Object obj) {
        return (obj instanceof AnonymousClass27G) && (A0a((AnonymousClass27G) obj) instanceof Map);
    }

    public static boolean A1T(Object obj) {
        return (obj instanceof AnonymousClass27G) && (((AnonymousClass27G) obj).A00 instanceof AnonymousClass1H5);
    }

    public static boolean A1U(Object obj) {
        return (obj instanceof AnonymousClass27G) && (A0a((AnonymousClass27G) obj) instanceof String);
    }

    public static boolean A1V(String str) {
        Uri parse = Uri.parse(A0i(str));
        return parse.getHost().equalsIgnoreCase("www.instagram.com") || parse.getHost().equalsIgnoreCase("instagram.com") || parse.getHost().equalsIgnoreCase("instagr.am") || parse.getHost().equalsIgnoreCase("www.instagr.am");
    }
}
