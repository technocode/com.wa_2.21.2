package X;

import com.whatsapp.AudioPickerActivity;

/* renamed from: X.1rK  reason: invalid class name and case insensitive filesystem */
public class C39331rK implements AnonymousClass0YR {
    public final /* synthetic */ AudioPickerActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public C39331rK(AudioPickerActivity audioPickerActivity) {
        this.A00 = audioPickerActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        AudioPickerActivity audioPickerActivity = this.A00;
        audioPickerActivity.A0B = str;
        audioPickerActivity.A0C = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) audioPickerActivity).A01);
        if (audioPickerActivity != null) {
            AbstractC15640oQ.A00(audioPickerActivity).A02(0, null, audioPickerActivity);
            return false;
        }
        throw null;
    }
}
