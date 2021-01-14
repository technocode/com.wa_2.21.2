package X;

import com.facebook.msys.mci.Crypto;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.msys.mci.DefaultUUID;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.msys.mci.UUID;

/* renamed from: X.0MR  reason: invalid class name */
public class AnonymousClass0MR implements ProxyProvider {
    @Override // com.facebook.msys.mci.ProxyProvider
    public Crypto getCrypto() {
        return DefaultCrypto.mCrypto;
    }

    @Override // com.facebook.msys.mci.ProxyProvider
    public UUID getUUID() {
        return DefaultUUID.mUUID;
    }
}
