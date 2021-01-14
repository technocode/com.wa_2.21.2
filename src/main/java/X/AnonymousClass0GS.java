package X;

/* renamed from: X.0GS  reason: invalid class name */
public class AnonymousClass0GS implements AnonymousClass0GT {
    public static volatile AnonymousClass0GS A0A;
    public int A00;
    public int A01;
    public final AnonymousClass00S A02;
    public final C018609s A03;
    public final C01980Ae A04;
    public final C02010Ah A05;
    public final C02040Ak A06;
    public final C01970Ad A07;
    public final C018809u A08 = C018809u.A00("PaymentUnfinishedTransactionsSyncer", "network", "COMMON");
    public final AnonymousClass00T A09;

    public AnonymousClass0GS(AnonymousClass00S r4, AnonymousClass00T r5, C01970Ad r6, C02010Ah r7, C01980Ae r8, C02040Ak r9, C018609s r10) {
        this.A02 = r4;
        this.A09 = r5;
        this.A07 = r6;
        this.A05 = r7;
        this.A04 = r8;
        this.A06 = r9;
        this.A03 = r10;
    }

    public static AnonymousClass0GS A00() {
        if (A0A == null) {
            synchronized (AnonymousClass0GS.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass0GS(AnonymousClass00S.A00(), C002101e.A00(), C01970Ad.A00(), C02010Ah.A00(), C01980Ae.A00(), C02040Ak.A00(), C018609s.A04());
                }
            }
        }
        return A0A;
    }

    public synchronized void A01(AbstractC61132sY r4) {
        if (!this.A06.A02() || !this.A04.A09()) {
            this.A08.A07(null, "skipped as account setup is incomplete.", null);
        } else {
            this.A09.ANF(new RunnableEBaseShape3S0200000_I0_2(this, r4, 28));
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r4) {
        C018809u r2 = this.A08;
        StringBuilder sb = new StringBuilder("onRequestError: ");
        sb.append(r4);
        r2.A04(sb.toString());
        AbstractC61782tj A6O = this.A07.A03().A6O();
        if (A6O != null) {
            A6O.AGY(r4);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r4) {
        C018809u r2 = this.A08;
        StringBuilder sb = new StringBuilder("onResponseError: ");
        sb.append(r4);
        r2.A04(sb.toString());
        AbstractC61782tj A6O = this.A07.A03().A6O();
        if (A6O != null) {
            A6O.AGY(r4);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r7) {
        AbstractC61782tj A6O = this.A07.A03().A6O();
        if (A6O != null) {
            A6O.AGY(null);
        }
        if (r7.A02) {
            int i = this.A00 + 1;
            this.A00 = i;
            C018809u r5 = this.A08;
            StringBuilder A0S = AnonymousClass008.A0S("finished syncing ");
            A0S.append(i);
            A0S.append(" transactions; total to sync: ");
            AnonymousClass008.A1N(A0S, this.A01, r5);
            if (this.A01 == this.A00) {
                long A052 = this.A02.A05();
                this.A05.A01().edit().putLong("payments_pending_transactions_last_sync_time", A052).apply();
                r5.A07(null, AnonymousClass008.A0I("updatePendingTransactionsLastSyncTimeMilli to: ", A052), null);
            }
        }
    }
}
