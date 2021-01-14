package X;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.1js  reason: invalid class name and case insensitive filesystem */
public final class HandlerC35151js extends HandlerC242019j {
    public final /* synthetic */ AbstractC238217s A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC35151js(AbstractC238217s r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        Object obj;
        boolean z;
        IInterface iInterface;
        AbstractC238217s r3 = this.A00;
        if (r3.A0C.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                AbstractC238017q r0 = (AbstractC238017q) message.obj;
                if (r0 != null) {
                    r0.A00();
                    return;
                }
                throw null;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !r3.AAw()) {
            AbstractC238017q r02 = (AbstractC238017q) message.obj;
            if (r02 != null) {
                r02.A00();
                return;
            }
            throw null;
        }
        int i3 = message.what;
        PendingIntent pendingIntent = null;
        if (i3 == 4) {
            r3.A07 = new C34661ix(message.arg2);
            if (!r3.A0D) {
                String A02 = r3.A02();
                if (!TextUtils.isEmpty(A02) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(A02);
                        if (!r3.A0D) {
                            r3.A05(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
            }
            C34661ix r1 = r3.A07;
            if (r1 == null) {
                r1 = new C34661ix(8);
            }
            r3.A08.AJN(r1);
            r3.A06(r1);
        } else if (i3 == 5) {
            C34661ix r12 = r3.A07;
            if (r12 == null) {
                r12 = new C34661ix(8);
            }
            r3.A08.AJN(r12);
            r3.A06(r12);
        } else if (i3 == 3) {
            Object obj2 = message.obj;
            if (obj2 instanceof PendingIntent) {
                pendingIntent = (PendingIntent) obj2;
            }
            C34661ix r13 = new C34661ix(message.arg2, pendingIntent);
            r3.A08.AJN(r13);
            r3.A06(r13);
        } else if (i3 == 6) {
            r3.A05(5, null);
            AbstractC237617m r03 = r3.A0H;
            if (r03 != null) {
                ((C35271k4) r03).A00.AEZ(message.arg2);
            }
            r3.A00 = message.arg2;
            r3.A03 = System.currentTimeMillis();
            AbstractC238217s.A00(r3, 5, 1, null);
        } else if (i3 != 2 || r3.isConnected()) {
            int i4 = message.what;
            if (i4 == 2 || i4 == 1 || i4 == 7) {
                AbstractC238017q r32 = (AbstractC238017q) message.obj;
                synchronized (r32) {
                    obj = r32.A00;
                    if (r32.A01) {
                        String valueOf = String.valueOf(r32);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                        sb.append("Callback proxy ");
                        sb.append(valueOf);
                        sb.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb.toString());
                    }
                }
                if (obj != null) {
                    try {
                        AbstractC35141jr r5 = (AbstractC35141jr) r32;
                        int i5 = r5.A00;
                        PendingIntent pendingIntent2 = null;
                        if (i5 == 0) {
                            if (!(r5 instanceof AnonymousClass268)) {
                                AnonymousClass267 r04 = (AnonymousClass267) r5;
                                z = false;
                                try {
                                    IBinder iBinder = r04.A00;
                                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                                    AbstractC238217s r7 = r04.A01;
                                    String A022 = r7.A02();
                                    if (!A022.equals(interfaceDescriptor)) {
                                        Log.e("GmsClient", AnonymousClass008.A09(AnonymousClass008.A00(interfaceDescriptor, AnonymousClass008.A00(A022, 34)), "service descriptor mismatch: ", A022, " vs. ", interfaceDescriptor));
                                    } else {
                                        if (!(r7 instanceof AnonymousClass29M)) {
                                            if (!(r7 instanceof AnonymousClass29K)) {
                                                if (!(r7 instanceof AnonymousClass29I)) {
                                                    if (!(r7 instanceof AnonymousClass29F)) {
                                                        if (!(r7 instanceof AnonymousClass29E)) {
                                                            if (!(r7 instanceof AnonymousClass29C)) {
                                                                if (!(r7 instanceof AnonymousClass29B)) {
                                                                    if (!(r7 instanceof AnonymousClass29A)) {
                                                                        if (iBinder == null) {
                                                                            iInterface = null;
                                                                        } else {
                                                                            iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
                                                                            if (!(iInterface instanceof AbstractC235316f)) {
                                                                                iInterface = new C34631iu(iBinder);
                                                                            }
                                                                        }
                                                                    } else if (iBinder == null) {
                                                                        iInterface = null;
                                                                    } else {
                                                                        iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
                                                                        if (!(iInterface instanceof AnonymousClass18L)) {
                                                                            iInterface = new C35261k3(iBinder);
                                                                        }
                                                                    }
                                                                } else if (iBinder == null) {
                                                                    iInterface = null;
                                                                } else {
                                                                    iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                                                                    if (!(iInterface instanceof AnonymousClass19M)) {
                                                                        iInterface = new C35561kY(iBinder);
                                                                    }
                                                                }
                                                            } else if (iBinder == null) {
                                                                iInterface = null;
                                                            } else {
                                                                iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                                                                if (!(iInterface instanceof AnonymousClass19R)) {
                                                                    iInterface = new C35571kZ(iBinder);
                                                                }
                                                            }
                                                        } else if (iBinder == null) {
                                                            iInterface = null;
                                                        } else {
                                                            iInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
                                                            if (!(iInterface instanceof AbstractC241519d)) {
                                                                iInterface = new C35581ka(iBinder);
                                                            }
                                                        }
                                                    } else if (iBinder == null) {
                                                        iInterface = null;
                                                    } else {
                                                        iInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                                                        if (!(iInterface instanceof AnonymousClass1AP)) {
                                                            iInterface = new C35791kw(iBinder);
                                                        }
                                                    }
                                                } else if (iBinder == null) {
                                                    iInterface = null;
                                                } else {
                                                    iInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                                                    if (!(iInterface instanceof AbstractC24361Af)) {
                                                        iInterface = new C35881l7(iBinder);
                                                    }
                                                }
                                            } else if (iBinder == null) {
                                                iInterface = null;
                                            } else {
                                                iInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
                                                if (!(iInterface instanceof AbstractC24531Bi)) {
                                                    iInterface = new C36151lf(iBinder);
                                                }
                                            }
                                        } else if (iBinder == null) {
                                            iInterface = null;
                                        } else {
                                            iInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                                            if (!(iInterface instanceof AnonymousClass1CZ)) {
                                                iInterface = new C36551mN(iBinder);
                                            }
                                        }
                                        if (iInterface != null && (AbstractC238217s.A00(r7, 2, 4, iInterface) || AbstractC238217s.A00(r7, 3, 4, iInterface))) {
                                            r7.A07 = null;
                                            AbstractC237617m r05 = r7.A0H;
                                            if (r05 != null) {
                                                ((C35271k4) r05).A00.AEX(null);
                                            }
                                            z = true;
                                        }
                                    }
                                } catch (RemoteException unused2) {
                                    Log.w("GmsClient", "service probably died");
                                }
                            } else {
                                ((AnonymousClass268) r5).A00.A08.AJN(C34661ix.A04);
                                z = true;
                            }
                            if (!z) {
                                r5.A02.A05(1, null);
                                r5.A01(new C34661ix(8, null));
                            }
                        } else if (i5 != 10) {
                            r5.A02.A05(1, null);
                            Bundle bundle = r5.A01;
                            if (bundle != null) {
                                pendingIntent2 = (PendingIntent) bundle.getParcelable("pendingIntent");
                            }
                            r5.A01(new C34661ix(i5, pendingIntent2));
                        } else {
                            AbstractC238217s r33 = r5.A02;
                            r33.A05(1, null);
                            throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", r5.getClass().getSimpleName(), r33.A03(), r33.A02()));
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
                synchronized (r32) {
                    r32.A01 = true;
                }
                r32.A00();
                return;
            }
            Log.wtf("GmsClient", AnonymousClass008.A08(45, "Don't know how to handle message: ", i4), new Exception());
        } else {
            AbstractC238017q r06 = (AbstractC238017q) message.obj;
            if (r06 != null) {
                r06.A00();
                return;
            }
            throw null;
        }
    }
}
