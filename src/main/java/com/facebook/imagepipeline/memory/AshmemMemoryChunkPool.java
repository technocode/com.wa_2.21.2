package com.facebook.imagepipeline.memory;

import X.AbstractC19980vv;
import X.AbstractC20730xC;
import X.AbstractC20800xJ;
import X.AbstractC461428g;
import X.C20790xI;
import X.C32861fj;

public class AshmemMemoryChunkPool extends AbstractC461428g {
    public AshmemMemoryChunkPool(AbstractC19980vv r1, C20790xI r2, AbstractC20800xJ r3) {
        super(r1, r2, r3);
    }

    @Override // X.AnonymousClass250
    public Object A03(int i) {
        return new C32861fj(i);
    }

    @Override // X.AbstractC461428g
    public AbstractC20730xC A09(int i) {
        return new C32861fj(i);
    }
}
