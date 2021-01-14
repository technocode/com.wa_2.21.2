package X;

/* renamed from: X.2TZ  reason: invalid class name */
public class AnonymousClass2TZ extends Exception {
    public final int downloadStatus;

    public AnonymousClass2TZ(int i) {
        this.downloadStatus = i;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("DownloadResultException{downloadStatus=");
        A0S.append(AnonymousClass1W8.A00(this.downloadStatus));
        A0S.append('}');
        return A0S.toString();
    }
}
