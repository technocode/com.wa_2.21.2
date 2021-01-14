package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;

/* renamed from: X.0tY  reason: invalid class name and case insensitive filesystem */
public class C18560tY {
    public int A00 = 0;
    public List A01 = null;

    public C18560tY() {
    }

    public C18560tY(C18450tN r2) {
    }

    public void A00() {
        this.A00 += SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.A01) {
            sb.append(obj);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }
}
