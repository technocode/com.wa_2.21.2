package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.17U  reason: invalid class name */
public abstract class AnonymousClass17U {
    public static Status A00(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public void A01(Status status) {
        Exception r0;
        if (this instanceof C35001jZ) {
            ((C35001jZ) this).A00.A0B(status);
        } else if (!(this instanceof AnonymousClass265)) {
            ((AnonymousClass264) this).A00.A00(new AnonymousClass170(status));
        } else {
            AnonymousClass265 r02 = (AnonymousClass265) this;
            C24611Bq r1 = r02.A02;
            if (r02.A00 != null) {
                if (status.A02 != null) {
                    r0 = new C34721j4(status);
                } else {
                    r0 = new AnonymousClass170(status);
                }
                r1.A00(r0);
                return;
            }
            throw null;
        }
    }

    public void A02(C457125z r6) {
        if (this instanceof C35001jZ) {
            C35001jZ r2 = (C35001jZ) this;
            try {
                r2.A00.A0A(r6.A04);
            } catch (RuntimeException e) {
                r2.A04(e);
            }
        } else if (!(this instanceof AnonymousClass265)) {
            AnonymousClass264 r4 = (AnonymousClass264) this;
            try {
                AnonymousClass298 r22 = (AnonymousClass298) r4;
                r6.A09.remove(r22.A00);
                C24611Bq r0 = ((AnonymousClass264) r22).A00;
                Boolean bool = Boolean.FALSE;
                C011506v r23 = r0.A00;
                synchronized (r23.A04) {
                    if (!r23.A02) {
                        r23.A02 = true;
                        r23.A01 = bool;
                        r23.A03.A00(r23);
                    }
                }
            } catch (DeadObjectException e2) {
                r4.A00.A00(new AnonymousClass170(A00(e2)));
                throw e2;
            } catch (RemoteException e3) {
                r4.A00.A00(new AnonymousClass170(A00(e3)));
            } catch (RuntimeException e4) {
                r4.A00.A00(e4);
            }
        } else {
            AnonymousClass265 r24 = (AnonymousClass265) this;
            try {
                AnonymousClass17R r42 = r24.A01;
                AbstractC34701j2 r3 = r6.A04;
                C24611Bq r1 = r24.A02;
                if (!(r42 instanceof AnonymousClass26G)) {
                    AbstractC34561ij r43 = (AbstractC34561ij) r42;
                    r43.A00 = r1;
                    AbstractC241519d r32 = (AbstractC241519d) ((AbstractC238217s) r3).A01();
                    if (r43 instanceof C456325q) {
                        C456325q r44 = (C456325q) r43;
                        r32.ARw(new AnonymousClass2AN(r44, r44), r44.A00);
                    } else if (!(r43 instanceof C463028z)) {
                        C462928y r45 = (C462928y) r43;
                        r32.ARx(((AbstractC456125n) r45).A00, r45.A00);
                    } else {
                        C463028z r46 = (C463028z) r43;
                        r32.ARv(((AbstractC456125n) r46).A00, r46.A00);
                    }
                } else {
                    AnonymousClass26G r47 = (AnonymousClass26G) r42;
                    r47.A00 = r1;
                    ((AnonymousClass19M) ((AbstractC238217s) r3).A01()).ARu(new AnonymousClass26H(r47));
                }
            } catch (DeadObjectException e5) {
                throw e5;
            } catch (RemoteException e6) {
                r24.A01(A00(e6));
            } catch (RuntimeException e7) {
                r24.A02.A00(e7);
            }
        }
    }

    public void A03(AnonymousClass17S r6, boolean z) {
        if (this instanceof AnonymousClass298) {
            return;
        }
        if (!(this instanceof AnonymousClass265)) {
            AbstractC457025y r2 = ((C35001jZ) this).A00;
            r6.A00.put(r2, Boolean.valueOf(z));
            r2.A00(new C34771jC(r6, r2));
            return;
        }
        C24611Bq r22 = ((AnonymousClass265) this).A02;
        r6.A01.put(r22, Boolean.valueOf(z));
        C011506v r4 = r22.A00;
        C34781jD r3 = new C34781jD(r6, r22);
        if (r4 != null) {
            r4.A03.A01(new C36211ll(AnonymousClass070.A00, r3));
            r4.A06();
            return;
        }
        throw null;
    }

    public void A04(RuntimeException runtimeException) {
        if (this instanceof C35001jZ) {
            String simpleName = runtimeException.getClass().getSimpleName();
            String localizedMessage = runtimeException.getLocalizedMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(localizedMessage).length() + simpleName.length() + 2);
            sb.append(simpleName);
            sb.append(": ");
            sb.append(localizedMessage);
            ((C35001jZ) this).A00.A0B(new Status(10, sb.toString()));
        } else if (!(this instanceof AnonymousClass265)) {
            ((AnonymousClass264) this).A00.A00(runtimeException);
        } else {
            ((AnonymousClass265) this).A02.A00(runtimeException);
        }
    }
}
