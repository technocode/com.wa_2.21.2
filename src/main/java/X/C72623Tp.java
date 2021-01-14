package X;

import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import java.util.ArrayList;

/* renamed from: X.3Tp  reason: invalid class name and case insensitive filesystem */
public class C72623Tp implements AnonymousClass0YR {
    public final /* synthetic */ GroupCallParticipantPickerSheet A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public C72623Tp(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet) {
        this.A00 = groupCallParticipantPickerSheet;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = this.A00;
        ((AnonymousClass0QH) groupCallParticipantPickerSheet).A0I = str;
        ArrayList A03 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) groupCallParticipantPickerSheet).A01);
        ((AnonymousClass0QH) groupCallParticipantPickerSheet).A0J = A03;
        if (A03.isEmpty()) {
            ((AnonymousClass0QH) groupCallParticipantPickerSheet).A0J = null;
        }
        groupCallParticipantPickerSheet.A0a();
        return false;
    }
}
