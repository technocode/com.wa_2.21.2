package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationRequest;
import java.util.Map;

/* renamed from: X.25y  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC457025y extends BasePendingResult implements AnonymousClass17G {
    public final C236316w A00;
    public final AnonymousClass16z A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC457025y(AnonymousClass16z r2, AnonymousClass178 r3) {
        super(r3);
        C001801b.A1R(r3, "GoogleApiClient must not be null");
        C001801b.A1R(r2, "Api must not be null");
        this.A00 = r2.A00();
        this.A01 = r2;
    }

    public final void A0A(AbstractC236216v r20) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        AnonymousClass26Z r6;
        try {
            if (this instanceof AnonymousClass2AT) {
                ((AnonymousClass1CZ) ((AbstractC238217s) r20).A01()).ASC(new AnonymousClass2AU(this));
            } else if (this instanceof AnonymousClass2BV) {
                AnonymousClass2BV r62 = (AnonymousClass2BV) this;
                AnonymousClass29I r10 = (AnonymousClass29I) r20;
                AbstractC24351Ae r9 = r62.A00;
                byte[] bArr = r62.A02;
                String str = r62.A01;
                if (TextUtils.isEmpty(str)) {
                    if (r10 != null) {
                        try {
                            Context context = r10.A00;
                            PackageManager packageManager = context.getPackageManager();
                            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null)) {
                                str = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        str = null;
                    } else {
                        throw null;
                    }
                }
                ((AbstractC24361Af) r10.A01()).ARz(r9, bArr, str);
            } else if (this instanceof AnonymousClass2BU) {
                AnonymousClass2BU r63 = (AnonymousClass2BU) this;
                AbstractC24441Ao r7 = r63.A00;
                C001801b.A1R(r7, "Listener must not be null");
                C001801b.A1R("LocationListener", "Listener type must not be null");
                C001801b.A1V("LocationListener", "Listener type must not be empty");
                AnonymousClass17M r92 = new AnonymousClass17M(r7);
                AnonymousClass26Y r8 = new AnonymousClass26Y(r63);
                AnonymousClass1AQ r5 = ((AnonymousClass2AS) r20).A00;
                AnonymousClass1AV r72 = r5.A01;
                r72.A00();
                C001801b.A1R(r92, "Invalid null listener key");
                Map map = r5.A02;
                synchronized (map) {
                    AnonymousClass26Z r52 = (AnonymousClass26Z) map.remove(r92);
                    if (r52 != null) {
                        synchronized (r52) {
                            r52.A00.A02 = null;
                        }
                        ((AnonymousClass1AP) r72.A00.A01()).ARy(new C35821kz(2, null, r52.asBinder(), null, null, r8.asBinder()));
                    }
                }
            } else if (this instanceof AnonymousClass2BT) {
                AnonymousClass2BT r64 = (AnonymousClass2BT) this;
                AnonymousClass2AS r102 = (AnonymousClass2AS) r20;
                AnonymousClass26Y r73 = new AnonymousClass26Y(r64);
                LocationRequest locationRequest = r64.A01;
                AbstractC24441Ao r82 = r64.A00;
                boolean z = false;
                if (Looper.myLooper() != null) {
                    z = true;
                }
                C001801b.A1b(z, "Can't create handler inside thread that has not called Looper.prepare()");
                Looper myLooper = Looper.myLooper();
                C001801b.A1R(r82, "Listener must not be null");
                C001801b.A1R(myLooper, "Looper must not be null");
                C001801b.A1R("LocationListener", "Listener type must not be null");
                AnonymousClass17O r11 = new AnonymousClass17O(myLooper, r82);
                AnonymousClass1AQ r53 = r102.A00;
                synchronized (r53) {
                    AnonymousClass1AV r93 = r53.A01;
                    r93.A00();
                    Map map2 = r53.A02;
                    synchronized (map2) {
                        AnonymousClass17M r4 = r11.A00;
                        r6 = (AnonymousClass26Z) map2.get(r4);
                        if (r6 == null) {
                            r6 = new AnonymousClass26Z(r11);
                        }
                        map2.put(r4, r6);
                    }
                    ((AnonymousClass1AP) r93.A00.A01()).ARy(new C35821kz(1, new C35811ky(locationRequest, C35811ky.A07, null, false, false, false, null), r6, null, null, r73.asBinder()));
                }
            } else if (!(this instanceof AnonymousClass2AQ)) {
                AnonymousClass295 r103 = (AnonymousClass295) r20;
                ((AbstractC235316f) r103.A01()).ASG(new BinderC456625t((AnonymousClass2AP) this), r103.A00);
            } else {
                ((AnonymousClass18L) ((AbstractC238217s) r20).A01()).ART(new AnonymousClass26B(this));
            }
        } catch (DeadObjectException e) {
            A0B(new Status(1, 8, e.getLocalizedMessage(), null));
            throw e;
        } catch (RemoteException e2) {
            A0B(new Status(1, 8, e2.getLocalizedMessage(), null));
        }
    }

    public final void A0B(Status status) {
        boolean z = false;
        if (status.A01 <= 0) {
            z = true;
        }
        C001801b.A1a(!z, "Failed result must not be success");
        A06(A03(status));
    }
}
