package X;

import com.whatsapp.util.Log;

/* renamed from: X.2ZS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZS implements AnonymousClass37L {
    public final /* synthetic */ C60352pI A00;
    public final /* synthetic */ AnonymousClass0ZB A01;

    public /* synthetic */ AnonymousClass2ZS(C60352pI r1, AnonymousClass0ZB r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass37L
    public final void AIY(boolean z, int i) {
        C60352pI r2 = this.A00;
        AnonymousClass0ZB r4 = this.A01;
        C72403Ss r3 = r2.A03;
        if (r3 != null) {
            StringBuilder A0S = AnonymousClass008.A0S("conversation/row/gif/playbackState=");
            AnonymousClass25O r0 = r3.A08;
            if (r0 != null) {
                A0S.append(r0.A8R());
                A0S.append(" playWhenReady=");
                AnonymousClass25O r02 = r2.A03.A08;
                if (r02 != null) {
                    A0S.append(r02.A8P());
                    A0S.append(" key: ");
                    C007303n r6 = r4.A0n;
                    String str = r6.A01;
                    A0S.append(str);
                    A0S.append(" videoPlayerId=");
                    A0S.append(r2.A03.hashCode());
                    Log.d(A0S.toString());
                    if (i == 3) {
                        if (!z) {
                            RunnableEBaseShape9S0100000_I1_4 runnableEBaseShape9S0100000_I1_4 = new RunnableEBaseShape9S0100000_I1_4(r2, 0);
                            r2.A04 = runnableEBaseShape9S0100000_I1_4;
                            ((AbstractC51572Zg) r2).A0V.A02.postDelayed(runnableEBaseShape9S0100000_I1_4, 150);
                        } else if (r2.A06) {
                            StringBuilder A0S2 = AnonymousClass008.A0S("conversation/row/gif/hidethumbnail/");
                            A0S2.append(str);
                            A0S2.append(" videoPlayerId=");
                            A0S2.append(r2.A03.hashCode());
                            Log.d(A0S2.toString());
                            r2.A0H.setVisibility(4);
                            r2.A07.setVisibility(4);
                            r2.A09.sendAccessibilityEvent(8);
                            r2.A02 = System.currentTimeMillis();
                        }
                    } else if (i == 4) {
                        r2.A0H.setVisibility(0);
                        r2.A07.setVisibility(0);
                        AbstractC43421yL rowsContainer = r2.getRowsContainer();
                        if (rowsContainer != null) {
                            rowsContainer.A3i(r6);
                        }
                    } else if (i == 1) {
                        r2.A06 = true;
                        r2.A03.A05();
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }
}
