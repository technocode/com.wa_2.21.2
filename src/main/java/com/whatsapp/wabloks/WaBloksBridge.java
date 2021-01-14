package com.whatsapp.wabloks;

import X.AbstractC02170Ax;
import X.AnonymousClass3AP;
import X.AnonymousClass3VU;
import X.C67783Af;

public class WaBloksBridge extends AnonymousClass3AP {
    @Override // X.AnonymousClass3AP
    public void onBloksLoaded() {
    }

    @Override // X.AnonymousClass3AP
    public AbstractC02170Ax attain(Class cls) {
        return C67783Af.A01(cls);
    }

    @Override // X.AnonymousClass3AP
    public AnonymousClass3VU ui() {
        return (AnonymousClass3VU) AnonymousClass3AP.lazy(AnonymousClass3VU.class).get();
    }
}
