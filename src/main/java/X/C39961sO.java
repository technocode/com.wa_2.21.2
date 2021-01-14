package X;

import com.whatsapp.DocumentPickerActivity;

/* renamed from: X.1sO  reason: invalid class name and case insensitive filesystem */
public class C39961sO implements AnonymousClass0YR {
    public final /* synthetic */ DocumentPickerActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public C39961sO(DocumentPickerActivity documentPickerActivity) {
        this.A00 = documentPickerActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        DocumentPickerActivity documentPickerActivity = this.A00;
        documentPickerActivity.A05 = str;
        documentPickerActivity.A06 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) documentPickerActivity).A01);
        documentPickerActivity.A03.A00.filter(documentPickerActivity.A05);
        return false;
    }
}
