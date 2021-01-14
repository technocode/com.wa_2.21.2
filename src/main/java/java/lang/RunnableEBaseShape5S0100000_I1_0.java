package java.lang;

import X.AbstractC11200fs;
import X.AbstractC16780qQ;
import X.AbstractC16990qn;
import X.AnonymousClass248;
import X.AnonymousClass26L;
import X.C16710qH;
import X.C16720qI;
import X.C16730qK;
import X.C19890vm;
import X.C21780zJ;
import X.C30701bn;
import X.C30741bs;
import X.C30761bu;
import X.C31261ct;
import X.C32401et;
import X.C32421ev;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.room.IMultiInstanceInvalidationService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RunnableEBaseShape5S0100000_I1_0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape5S0100000_I1_0(C19890vm r2) {
        this.A01 = 25;
        this.A00 = r2;
    }

    public RunnableEBaseShape5S0100000_I1_0(C31261ct r1, int i) {
        this.A01 = i;
        if (20 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public RunnableEBaseShape5S0100000_I1_0(C32401et r2) {
        this.A01 = 31;
        this.A00 = r2;
    }

    public RunnableEBaseShape5S0100000_I1_0(C32421ev r2) {
        this.A01 = 32;
        this.A00 = r2;
    }

    public RunnableEBaseShape5S0100000_I1_0(AnonymousClass26L r2) {
        this.A01 = 47;
        this.A00 = r2;
    }

    public RunnableEBaseShape5S0100000_I1_0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public RunnableEBaseShape5S0100000_I1_0(List list, int i) {
        this.A01 = i;
        this.A00 = list;
    }

    public static void A00(RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0) {
        ((BiometricFragment) runnableEBaseShape5S0100000_I1_0.A00).A09 = true;
    }

    public static void A01(RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0) {
        Set set;
        Throwable e;
        Throwable th;
        ReentrantReadWriteLock.ReadLock readLock = ((C16720qI) runnableEBaseShape5S0100000_I1_0.A00).A05.A07.readLock();
        try {
            readLock.lock();
            C16720qI r2 = (C16720qI) runnableEBaseShape5S0100000_I1_0.A00;
            AbstractC16780qQ r1 = r2.A05;
            AbstractC16990qn r0 = r1.A08;
            if (r0 != null && ((C30761bu) r0).A00.isOpen()) {
                if (!r2.A09) {
                    r1.A00.A9w();
                }
                if (!r2.A09) {
                    Log.e("ROOM", "database is not initialized even though it is open");
                } else if (!((C16720qI) runnableEBaseShape5S0100000_I1_0.A00).A03.compareAndSet(true, false)) {
                    readLock.unlock();
                    return;
                } else if (((C30761bu) ((C16720qI) runnableEBaseShape5S0100000_I1_0.A00).A05.A00.A9w()).A00.inTransaction()) {
                    readLock.unlock();
                    return;
                } else {
                    if (((C16720qI) runnableEBaseShape5S0100000_I1_0.A00).A05.A04) {
                        AbstractC16990qn A9w = ((C16720qI) runnableEBaseShape5S0100000_I1_0.A00).A05.A00.A9w();
                        ((C30761bu) A9w).A00.beginTransaction();
                        try {
                            set = runnableEBaseShape5S0100000_I1_0.A05();
                            try {
                                ((C30761bu) A9w).A00.setTransactionSuccessful();
                                try {
                                    ((C30761bu) A9w).A00.endTransaction();
                                } catch (SQLiteException | IllegalStateException e2) {
                                    e = e2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                ((C30761bu) A9w).A00.endTransaction();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            ((C30761bu) A9w).A00.endTransaction();
                            throw th;
                        }
                    } else {
                        set = runnableEBaseShape5S0100000_I1_0.A05();
                    }
                    readLock.unlock();
                    if (!(set == null || set.isEmpty())) {
                        synchronized (((C16720qI) runnableEBaseShape5S0100000_I1_0.A00).A04) {
                            Iterator it = ((C16720qI) runnableEBaseShape5S0100000_I1_0.A00).A04.iterator();
                            while (true) {
                                AbstractC11200fs r12 = (AbstractC11200fs) it;
                                if (r12.hasNext()) {
                                    C16710qH r7 = (C16710qH) ((Map.Entry) r12.next()).getValue();
                                    int length = r7.A02.length;
                                    Set set2 = null;
                                    for (int i = 0; i < length; i++) {
                                        if (set.contains(Integer.valueOf(r7.A02[i]))) {
                                            if (length == 1) {
                                                set2 = r7.A01;
                                            } else {
                                                if (set2 == null) {
                                                    set2 = new HashSet(length);
                                                }
                                                set2.add(r7.A03[i]);
                                            }
                                        }
                                    }
                                    if (set2 != null) {
                                        C16730qK r13 = ((C30701bn) r7.A00).A00;
                                        if (!r13.A07.get()) {
                                            try {
                                                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = r13.A01;
                                                if (iMultiInstanceInvalidationService != null) {
                                                    iMultiInstanceInvalidationService.A2M(r13.A00, (String[]) set2.toArray(new String[0]));
                                                }
                                            } catch (RemoteException e3) {
                                                Log.w("ROOM", "Cannot broadcast invalidation", e3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
            }
            readLock.unlock();
        } catch (SQLiteException | IllegalStateException e4) {
            e = e4;
            set = null;
            try {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                readLock.unlock();
                if (set == null) {
                }
            } catch (Throwable th4) {
                readLock.unlock();
                throw th4;
            }
        }
    }

    public static void A02(RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0) {
        C32421ev r1 = (C32421ev) runnableEBaseShape5S0100000_I1_0.A00;
        r1.A01.A0J.A00(5, r1.A00);
    }

    public static void A03(RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0) {
        List list = ((C21780zJ) runnableEBaseShape5S0100000_I1_0.A00).A0G.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C32401et) list.get(i)).A00();
        }
    }

    public static void A04(RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0) {
        List list = ((C21780zJ) runnableEBaseShape5S0100000_I1_0.A00).A0H.A00;
        if (0 < list.size()) {
            list.get(0);
            throw null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final Set A05() {
        HashSet hashSet = new HashSet();
        C16720qI r3 = (C16720qI) this.A00;
        AbstractC16780qQ r2 = r3.A05;
        C30741bs r1 = new C30741bs("SELECT * FROM room_table_modification_log WHERE invalidated = 1;");
        r2.A00();
        r2.A01();
        Cursor A002 = ((C30761bu) r2.A00.A9w()).A00(r1);
        while (A002.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(A002.getInt(0)));
            } catch (Throwable th) {
                A002.close();
                throw th;
            }
        }
        A002.close();
        if (!hashSet.isEmpty()) {
            ((AnonymousClass248) r3.A08).A00.executeUpdateDelete();
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02f3, code lost:
        if (r12 < 0) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0314, code lost:
        if (r3 < 0) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0371, code lost:
        if (r3 > 0) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0396, code lost:
        if (r12 > 0) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0822, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        r6.A01.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0828, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0906, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:?, code lost:
        r4.A01.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x090c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a72, code lost:
        if (r0 == false) goto L_0x0a74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x0f96, code lost:
        if (r7.A68() != -9223372036854775807L) goto L_0x0f98;
     */
    /* JADX WARNING: Removed duplicated region for block: B:774:0x1095 A[Catch:{ all -> 0x13e4, all -> 0x1417 }] */
    /* JADX WARNING: Removed duplicated region for block: B:784:0x10c5 A[Catch:{ all -> 0x13e4, all -> 0x1417 }, LOOP:17: B:782:0x10bf->B:784:0x10c5, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 5328
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape5S0100000_I1_0.run():void");
    }
}
