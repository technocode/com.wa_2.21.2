package X;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.19P  reason: invalid class name */
public class AnonymousClass19P extends Binder implements IInterface {
    public AnonymousClass19P(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: finally extract failed */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        List arrayList;
        Parcelable parcelable;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof BinderC456725u) {
            BinderC456725u r2 = (BinderC456725u) this;
            if (i == 1) {
                r2.A00();
                Context context = r2.A00;
                C234916a A00 = C234916a.A00(context);
                GoogleSignInAccount A02 = A00.A02();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0A;
                if (A02 != null) {
                    googleSignInOptions = A00.A03();
                }
                AnonymousClass175 r22 = new AnonymousClass175(context);
                AnonymousClass16z r1 = AnonymousClass16Q.A05;
                C001801b.A1R(r1, "Api must not be null");
                C001801b.A1R(googleSignInOptions, "Null options are not permitted for this Api");
                r22.A0A.put(r1, googleSignInOptions);
                if (!(r1.A00 instanceof C456925x)) {
                    arrayList = Collections.emptyList();
                } else if (googleSignInOptions == null) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList(googleSignInOptions.A06);
                }
                r22.A0C.addAll(arrayList);
                r22.A0B.addAll(arrayList);
                AnonymousClass178 A002 = r22.A00();
                try {
                    if (!(A002 instanceof AnonymousClass263)) {
                        C34881jN r5 = (C34881jN) A002;
                        boolean z = false;
                        boolean z2 = false;
                        if (Looper.myLooper() != Looper.getMainLooper()) {
                            z2 = true;
                        }
                        C001801b.A1b(z2, "blockingConnect must not be called on the UI thread");
                        Lock lock = r5.A0L;
                        lock.lock();
                        try {
                            if (r5.A06 >= 0) {
                                if (r5.A04 != null) {
                                    z = true;
                                }
                                C001801b.A1b(z, "Sign-in mode should have been set explicitly by auto-manage.");
                            } else {
                                Integer num = r5.A04;
                                if (num == null) {
                                    r5.A04 = Integer.valueOf(C34881jN.A00(r5.A0J.values(), false));
                                } else if (num.intValue() == 2) {
                                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                                }
                            }
                            r5.A05(r5.A04.intValue());
                            r5.A0G.A08 = true;
                            C34661ix A2K = r5.A03.A2K();
                            lock.unlock();
                            if (A2K.A02()) {
                                if (A02 != null) {
                                    Context context2 = ((C34881jN) A002).A07;
                                    AnonymousClass18U r52 = AnonymousClass16c.A00;
                                    Object[] objArr = new Object[0];
                                    if (r52.A00 <= 3) {
                                        Log.d("GoogleSignInCommon", r52.A00("Revoking access", objArr));
                                    }
                                    C234916a.A00(context2).A04("refreshToken");
                                    C235116d.A00(context2).A01();
                                    Set<AnonymousClass178> set = AnonymousClass178.A00;
                                    synchronized (set) {
                                    }
                                    for (AnonymousClass178 r12 : set) {
                                        if (!(r12 instanceof C34881jN)) {
                                            throw new UnsupportedOperationException();
                                        }
                                        AnonymousClass17Y r0 = ((C34881jN) r12).A03;
                                        if (r0 != null) {
                                            r0.AC3();
                                        }
                                    }
                                    synchronized (AnonymousClass17J.A0G) {
                                        AnonymousClass17J r13 = AnonymousClass17J.A0D;
                                        if (r13 != null) {
                                            r13.A0C.incrementAndGet();
                                            Handler handler = r13.A05;
                                            handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                                        }
                                    }
                                    A002.A01(new AnonymousClass2AP(A002));
                                } else if (!(A002 instanceof AnonymousClass263)) {
                                    C34881jN r7 = (C34881jN) A002;
                                    C001801b.A1b(r7.A04(), "GoogleApiClient is not connected yet.");
                                    boolean z3 = false;
                                    if (r7.A04.intValue() != 2) {
                                        z3 = true;
                                    }
                                    C001801b.A1b(z3, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
                                    AnonymousClass260 r3 = new AnonymousClass260(r7);
                                    if (r7.A0J.containsKey(AnonymousClass18I.A01)) {
                                        r7.A01(new AnonymousClass2AQ(r7)).A01(new C34921jR(r7, r3, false, r7));
                                    } else {
                                        AtomicReference atomicReference = new AtomicReference();
                                        C34901jP r53 = new C34901jP(r7, atomicReference, r3);
                                        C34911jQ r4 = new C34911jQ(r3);
                                        AnonymousClass175 r32 = new AnonymousClass175(r7.A07);
                                        r32.A01(AnonymousClass18I.A02);
                                        C001801b.A1R(r53, "Listener must not be null");
                                        r32.A07.add(r53);
                                        C001801b.A1R(r4, "Listener must not be null");
                                        r32.A08.add(r4);
                                        HandlerC34931jS r14 = r7.A0C;
                                        C001801b.A1R(r14, "Handler must not be null");
                                        r32.A01 = r14.getLooper();
                                        AnonymousClass178 A003 = r32.A00();
                                        atomicReference.set(A003);
                                        A003.A02();
                                    }
                                } else {
                                    throw new UnsupportedOperationException(((AnonymousClass263) A002).A01);
                                }
                            }
                            return true;
                        } catch (Throwable th) {
                            lock.unlock();
                            throw th;
                        }
                    } else {
                        throw new UnsupportedOperationException(((AnonymousClass263) A002).A01);
                    }
                } finally {
                    A002.A03();
                }
            } else if (i != 2) {
                return false;
            } else {
                r2.A00();
                C235116d.A00(r2.A00).A01();
                return true;
            }
        } else if (!(this instanceof BinderC456625t)) {
            throw null;
        } else {
            BinderC456625t r23 = (BinderC456625t) this;
            switch (i) {
                case 101:
                    Parcelable.Creator creator = GoogleSignInAccount.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator.createFromParcel(parcel);
                    }
                    Parcelable.Creator creator2 = Status.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator2.createFromParcel(parcel);
                    }
                    throw new UnsupportedOperationException();
                case 102:
                    Parcelable.Creator creator3 = Status.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator3.createFromParcel(parcel);
                    }
                    throw new UnsupportedOperationException();
                case 103:
                    Parcelable.Creator creator4 = Status.CREATOR;
                    if (parcel.readInt() == 0) {
                        parcelable = null;
                    } else {
                        parcelable = (Parcelable) creator4.createFromParcel(parcel);
                    }
                    r23.A00.A06((Status) parcelable);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }
}
