package X;

import java.io.IOException;
import java.util.Collection;

/* renamed from: X.079  reason: invalid class name */
public abstract class AnonymousClass079 implements AnonymousClass076 {
    public int A00 = 0;

    public static void A07(Iterable iterable, Collection collection) {
        if (iterable == null) {
            throw null;
        } else if (iterable instanceof Collection) {
            for (Object obj : iterable) {
                if (obj == null) {
                    throw null;
                }
            }
            collection.addAll((Collection) iterable);
        } else {
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    collection.add(obj2);
                } else {
                    throw null;
                }
            }
        }
    }

    public AnonymousClass071 A08() {
        try {
            AnonymousClass1FG r2 = new AnonymousClass1FG(A90());
            AbstractC11750gu r0 = r2.A00;
            ARP(r0);
            C11820h2 r02 = (C11820h2) r0;
            if (r02.A01 - r02.A00 == 0) {
                return new AnonymousClass072(r2.A01);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            StringBuilder A0S = AnonymousClass008.A0S("Serializing ");
            A0S.append(getClass().getName());
            A0S.append(" to a ");
            A0S.append("ByteString");
            A0S.append(" threw an IOException (should never happen).");
            throw new RuntimeException(A0S.toString(), e);
        }
    }

    public byte[] A09() {
        try {
            int A90 = A90();
            byte[] bArr = new byte[A90];
            C11820h2 r0 = new C11820h2(bArr, A90);
            ARP(r0);
            if (r0.A01 - r0.A00 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            StringBuilder A0S = AnonymousClass008.A0S("Serializing ");
            A0S.append(getClass().getName());
            A0S.append(" to a ");
            A0S.append("byte array");
            A0S.append(" threw an IOException (should never happen).");
            throw new RuntimeException(A0S.toString(), e);
        }
    }
}
