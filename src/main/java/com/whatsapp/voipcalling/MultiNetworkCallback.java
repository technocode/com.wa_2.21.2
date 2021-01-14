package com.whatsapp.voipcalling;

import X.AnonymousClass37t;
import X.AnonymousClass39E;

public class MultiNetworkCallback {
    public final AnonymousClass39E provider;

    public MultiNetworkCallback(AnonymousClass39E r1) {
        this.provider = r1;
    }

    public void closeAlternativeSocket(boolean z) {
        AnonymousClass39E r3 = this.provider;
        r3.A06.execute(new RunnableEBaseShape1S0110000_I1(r3, z, 13));
    }

    public void createAlternativeSocket(boolean z, boolean z2) {
        AnonymousClass39E r2 = this.provider;
        r2.A06.execute(new AnonymousClass37t(r2, z, z2));
    }
}
