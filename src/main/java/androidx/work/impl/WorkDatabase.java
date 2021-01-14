package androidx.work.impl;

import X.AbstractC16780qQ;
import X.AbstractC17020qq;
import X.AbstractC17030qr;
import X.AbstractC17930sV;
import X.AbstractC17950sX;
import X.AbstractC17970sZ;
import X.AbstractC18000sc;
import X.AbstractC18040sg;
import X.AbstractC18060si;
import X.AnonymousClass008;
import X.C06840Ux;
import X.C16680qC;
import X.C16750qN;
import X.C16770qP;
import X.C17010qp;
import X.C17720s7;
import X.C30711bo;
import X.C30781bw;
import X.C31111cZ;
import X.C31121ca;
import X.C31191ci;
import X.C31201cj;
import X.C31211ck;
import X.C31331d2;
import X.C31341d3;
import X.C31361d5;
import X.C31391d9;
import X.C31481dI;
import X.C31491dJ;
import X.EnumC16760qO;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends AbstractC16780qQ {
    public static final long A00 = TimeUnit.DAYS.toMillis(7);

    public static WorkDatabase A00(Context context, Executor executor, boolean z) {
        C16750qN r1;
        String str;
        boolean z2 = true;
        if (z) {
            r1 = new C16750qN(context, null);
            r1.A07 = true;
        } else {
            r1 = new C16750qN(context, "androidx.work.workdb");
            r1.A01 = new C31111cZ(context);
        }
        r1.A04 = executor;
        C31121ca r3 = new C31121ca();
        ArrayList arrayList = r1.A02;
        if (arrayList == null) {
            arrayList = new ArrayList();
            r1.A02 = arrayList;
        }
        arrayList.add(r3);
        r1.A00(C17720s7.A00);
        r1.A00(new C31191ci(context, 2, 3));
        r1.A00(C17720s7.A01);
        r1.A00(C17720s7.A02);
        r1.A00(new C31191ci(context, 5, 6));
        r1.A00(C17720s7.A03);
        r1.A00(C17720s7.A04);
        r1.A00(C17720s7.A05);
        r1.A00(new C31201cj(context));
        r1.A00(new C31191ci(context, 10, 11));
        r1.A08 = false;
        r1.A06 = true;
        EnumC16760qO r5 = EnumC16760qO.WRITE_AHEAD_LOGGING;
        Context context2 = r1.A09;
        if (context2 != null) {
            Class cls = r1.A0B;
            if (cls != null) {
                Executor executor2 = r1.A04;
                if (executor2 == null && r1.A05 == null) {
                    Executor executor3 = C06840Ux.A02;
                    r1.A05 = executor3;
                    r1.A04 = executor3;
                } else if (executor2 == null) {
                    Executor executor4 = r1.A05;
                    if (executor4 != null) {
                        r1.A04 = executor4;
                    }
                } else if (r1.A05 == null) {
                    r1.A05 = executor2;
                }
                AbstractC17020qq r12 = r1.A01;
                if (r12 == null) {
                    r12 = new C30781bw();
                    r1.A01 = r12;
                }
                String str2 = r1.A0C;
                C16770qP r13 = r1.A0A;
                ArrayList arrayList2 = r1.A02;
                boolean z3 = r1.A07;
                EnumC16760qO r7 = r1.A00;
                if (r7 != null) {
                    if (r7 == EnumC16760qO.AUTOMATIC) {
                        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                        if (activityManager == null || (Build.VERSION.SDK_INT >= 19 && activityManager.isLowRamDevice())) {
                            r7 = EnumC16760qO.TRUNCATE;
                        } else {
                            r7 = r5;
                        }
                    }
                    C16680qC r9 = new C16680qC(context2, str2, r12, r13, arrayList2, z3, r7, r1.A04, r1.A05, r1.A08, r1.A06);
                    String name = cls.getPackage().getName();
                    String canonicalName = cls.getCanonicalName();
                    boolean isEmpty = name.isEmpty();
                    if (!isEmpty) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(canonicalName.replace('.', '_'));
                    sb.append("_Impl");
                    String obj = sb.toString();
                    if (isEmpty) {
                        str = obj;
                    } else {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(name);
                            sb2.append(".");
                            sb2.append(obj);
                            str = sb2.toString();
                        } catch (ClassNotFoundException unused) {
                            StringBuilder A0S = AnonymousClass008.A0S("cannot find implementation for ");
                            A0S.append(cls.getCanonicalName());
                            A0S.append(". ");
                            A0S.append(obj);
                            A0S.append(" does not exist");
                            throw new RuntimeException(A0S.toString());
                        } catch (IllegalAccessException unused2) {
                            StringBuilder A0S2 = AnonymousClass008.A0S("Cannot access the constructor");
                            A0S2.append(cls.getCanonicalName());
                            throw new RuntimeException(A0S2.toString());
                        } catch (InstantiationException unused3) {
                            StringBuilder A0S3 = AnonymousClass008.A0S("Failed to create an instance of ");
                            A0S3.append(cls.getCanonicalName());
                            throw new RuntimeException(A0S3.toString());
                        }
                    }
                    AbstractC16780qQ r72 = (AbstractC16780qQ) Class.forName(str).newInstance();
                    C30711bo r6 = new C30711bo(r9, new C31211ck((WorkDatabase_Impl) r72));
                    Context context3 = r9.A00;
                    String str3 = r9.A04;
                    if (context3 != null) {
                        AbstractC17030qr A3C = r9.A03.A3C(new C17010qp(context3, str3, r6, false));
                        r72.A00 = A3C;
                        if (r9.A01 != r5) {
                            z2 = false;
                        }
                        A3C.APP(z2);
                        r72.A01 = r9.A05;
                        r72.A02 = r9.A06;
                        r72.A03 = r9.A09;
                        r72.A04 = z2;
                        return (WorkDatabase) r72;
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw null;
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    public AbstractC17930sV A05() {
        AbstractC17930sV r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A00 != null) {
            return workDatabase_Impl.A00;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A00 == null) {
                workDatabase_Impl.A00 = new C31331d2(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A00;
        }
        return r0;
    }

    public AbstractC17950sX A06() {
        AbstractC17950sX r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A01 != null) {
            return workDatabase_Impl.A01;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A01 == null) {
                workDatabase_Impl.A01 = new C31341d3(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A01;
        }
        return r0;
    }

    public AbstractC17970sZ A07() {
        AbstractC17970sZ r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A02 != null) {
            return workDatabase_Impl.A02;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A02 == null) {
                workDatabase_Impl.A02 = new C31361d5(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A02;
        }
        return r0;
    }

    public AbstractC18000sc A08() {
        AbstractC18000sc r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A04 != null) {
            return workDatabase_Impl.A04;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A04 == null) {
                workDatabase_Impl.A04 = new C31391d9(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A04;
        }
        return r0;
    }

    public AbstractC18040sg A09() {
        AbstractC18040sg r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A05 != null) {
            return workDatabase_Impl.A05;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A05 == null) {
                workDatabase_Impl.A05 = new C31481dI(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A05;
        }
        return r0;
    }

    public AbstractC18060si A0A() {
        AbstractC18060si r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A06 != null) {
            return workDatabase_Impl.A06;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A06 == null) {
                workDatabase_Impl.A06 = new C31491dJ(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A06;
        }
        return r0;
    }
}
