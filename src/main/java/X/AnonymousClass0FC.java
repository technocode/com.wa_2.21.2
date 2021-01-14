package X;

import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0FC  reason: invalid class name */
public class AnonymousClass0FC {
    public static final Set A0E = new HashSet(Arrays.asList(400, 405, 406));
    public final AnonymousClass009 A00;
    public final AnonymousClass0F5 A01;
    public final AnonymousClass0F6 A02;
    public final AnonymousClass0FB A03;
    public final AnonymousClass0DX A04;
    public final C02410Bw A05;
    public final AnonymousClass0F1 A06;
    public final AnonymousClass0DL A07;
    public final AnonymousClass0DT A08;
    public final AnonymousClass00S A09;
    public final AnonymousClass0F3 A0A;
    public final AnonymousClass0F2 A0B;
    public final AnonymousClass0DU A0C;
    public final AnonymousClass0FA A0D;

    public AnonymousClass0FC(AnonymousClass00S r1, AnonymousClass009 r2, AnonymousClass0DL r3, AnonymousClass0DT r4, AnonymousClass0DX r5, AnonymousClass0DU r6, AnonymousClass0F1 r7, AnonymousClass0F2 r8, AnonymousClass0F5 r9, AnonymousClass0F3 r10, C02410Bw r11, AnonymousClass0F6 r12, AnonymousClass0FA r13, AnonymousClass0FB r14) {
        this.A09 = r1;
        this.A00 = r2;
        this.A07 = r3;
        this.A08 = r4;
        this.A04 = r5;
        this.A0C = r6;
        this.A06 = r7;
        this.A0B = r8;
        this.A01 = r9;
        this.A0A = r10;
        this.A05 = r11;
        this.A02 = r12;
        this.A0D = r13;
        this.A03 = r14;
    }

    public void A00(int i) {
        String obj;
        StringBuilder A0S = AnonymousClass008.A0S("sync-response-handler/fatalFailure reason:");
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            obj = null;
        } else {
            obj = valueOf.toString();
        }
        AnonymousClass008.A1T(A0S, obj);
        AnonymousClass0DX r2 = this.A04;
        if (r2 != null) {
            AnonymousClass20V r1 = new AnonymousClass20V();
            r1.A00 = Integer.valueOf(i);
            r2.A04.A0B(r1, null, false);
            this.A0D.A02();
            this.A05.A00.edit().remove("first_transient_server_failure_timestamp").apply();
            AnonymousClass0FB r6 = this.A03;
            if (r6 != null) {
                Log.i("sync-manager/onFatalFailure");
                int A062 = r6.A00.A06(AbstractC000400g.A41);
                r6.A02.A00.edit().putInt("disabled_version", A062).apply();
                AnonymousClass0DH.A01(r6.A01, false);
                AnonymousClass0F0 r0 = r6.A03;
                synchronized (r0.A00) {
                    Iterator it = r0.A00.iterator();
                    while (true) {
                        AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                        if (!r12.hasNext()) {
                            break;
                        }
                        AnonymousClass0KN r13 = (AnonymousClass0KN) r12.next();
                        if (r13 instanceof AnonymousClass0KM) {
                            AnonymousClass0KJ r3 = ((AnonymousClass0KM) r13).A00;
                            r3.A04.ANF(new RunnableEBaseShape2S0100000_I0_2(r3, 19));
                        }
                    }
                }
                synchronized (r6) {
                    r6.A01.A00 = null;
                }
                if (A062 >= 2) {
                    r6.A01.A0C();
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A01(C52802bm r5, int i) {
        this.A00.A04("malformed_syncd_mutation", r5.getMessage(), false);
        this.A04.A00.A03("invalid_action_counter", 1);
        throw new C52822bo(i);
    }

    public final void A02(String str, C52802bm r13) {
        StringBuilder A0S = AnonymousClass008.A0S("sync-response-handler/handleMutationException failed with MutationException, reason ");
        A0S.append(r13.reason);
        Log.e(A0S.toString(), r13);
        int i = r13.reason;
        switch (i) {
            case 0:
                A01(r13, 19);
                throw null;
            case 1:
                A01(r13, 21);
                throw null;
            case 2:
                A01(r13, 23);
                throw null;
            case 3:
                A01(r13, 24);
                throw null;
            case 4:
                A01(r13, 22);
                throw null;
            case 5:
                AnonymousClass0DU r4 = this.A0C;
                int i2 = r13.version;
                C48192Lg r6 = r13.operation;
                String str2 = r13.index;
                if (str2 != null) {
                    AnonymousClass0DM r8 = r13.syncdKeyId;
                    if (r8 != null) {
                        r4.A0C(i2, r6, str2, r8, str, r13.syncActionValue);
                        this.A04.A00.A03("unsupported_action_counter", 1);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 6:
                AnonymousClass0DU r42 = this.A0C;
                int i3 = r13.version;
                C48192Lg r62 = r13.operation;
                String str3 = r13.index;
                if (str3 != null) {
                    AnonymousClass0DM r82 = r13.syncdKeyId;
                    if (r82 != null) {
                        r42.A0C(i3, r62, str3, r82, str, r13.syncActionValue);
                        this.A00.A04("malformed_syncd_mutation", r13.getMessage(), false);
                        this.A04.A00.A03("unsupported_action_counter", 1);
                        return;
                    }
                    throw null;
                }
                throw null;
            default:
                StringBuilder A0S2 = AnonymousClass008.A0S("Unhandled MutationException with reason: ");
                A0S2.append(i);
                throw new RuntimeException(A0S2.toString());
        }
    }

    public void A03(Throwable th) {
        if (th instanceof C52822bo) {
            A00(((C52822bo) th).errorCode);
        } else if (th instanceof C52812bn) {
            this.A0D.A02();
            AnonymousClass0FB r1 = this.A03;
            if (r1 != null) {
                Log.i("sync-manager/onFailed");
                AnonymousClass0DH r12 = r1.A01;
                AnonymousClass0DH.A01(r12, false);
                r12.A0N();
                return;
            }
            throw null;
        } else if (th instanceof C52832bp) {
            boolean z = ((C52832bp) th).isServerTransient;
            A05(z, !z, this.A0D.A01());
        } else if (th instanceof SQLiteFullException) {
            A05(false, true, this.A0D.A01());
        } else {
            A05(true, false, this.A0D.A01());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0816, code lost:
        if (r6.A02 != false) goto L_0x0818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x096a, code lost:
        if (r6.A04 < r1.A04) goto L_0x096c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0b82, code lost:
        throw new X.C52822bo(12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0b8a, code lost:
        throw new X.C52822bo(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0b92, code lost:
        throw new X.C52822bo(17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0bb7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0bbb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0bbe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0bc2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0acd  */
    /* JADX WARNING: Removed duplicated region for block: B:642:0x0004 A[EDGE_INSN: B:642:0x0004->B:610:0x0004 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:643:0x0004 A[EDGE_INSN: B:643:0x0004->B:610:0x0004 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:652:0x0160 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.util.List r41) {
        /*
        // Method dump skipped, instructions count: 3012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FC.A04(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r9 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(boolean r8, boolean r9, java.lang.Long r10) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FC.A05(boolean, boolean, java.lang.Long):void");
    }
}
