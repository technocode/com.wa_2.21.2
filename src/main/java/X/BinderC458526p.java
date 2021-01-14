package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.26p  reason: invalid class name and case insensitive filesystem */
public class BinderC458526p extends AbstractBinderC36531mL {
    @Override // X.AnonymousClass1CX
    public void ARs(Status status) {
        if (!(this instanceof AnonymousClass29L)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // X.AnonymousClass1CX
    public void AS0(C36491mH r8) {
        String str;
        if (!(this instanceof AnonymousClass2AU)) {
            throw new UnsupportedOperationException();
        }
        AnonymousClass2AU r6 = (AnonymousClass2AU) this;
        ArrayList arrayList = new ArrayList();
        List list = r8.A01;
        if (list != null) {
            arrayList.addAll(list);
        }
        int i = r8.A00;
        switch (i) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            default:
                str = AnonymousClass0N2.A0q(i);
                break;
        }
        C458626q r1 = new C458626q(new Status(1, i, str, null), arrayList);
        AnonymousClass17G r0 = r6.A00;
        if (r0 != null) {
            ((BasePendingResult) r0).A06(r1);
            r6.A00 = null;
        }
    }
}
