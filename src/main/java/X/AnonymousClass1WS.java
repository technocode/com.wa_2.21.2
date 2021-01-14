package X;

/* renamed from: X.1WS  reason: invalid class name */
public final class AnonymousClass1WS {
    public final Runnable A00;
    public final String A01;
    public final byte[] A02;

    public AnonymousClass1WS(String str, byte[] bArr, Runnable runnable) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = runnable;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SendFieldStats{fieldStatsBlob=");
        byte[] bArr = this.A02;
        A0S.append(bArr != null ? bArr.length : 0);
        A0S.append(" bytes");
        A0S.append(", successCallback=");
        A0S.append(this.A00);
        A0S.append(", errorCallback=");
        A0S.append((Object) null);
        A0S.append(", readErrorCallback=");
        A0S.append((Object) null);
        A0S.append('}');
        return A0S.toString();
    }
}
