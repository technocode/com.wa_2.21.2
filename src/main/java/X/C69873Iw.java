package X;

import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.3Iw  reason: invalid class name and case insensitive filesystem */
public class C69873Iw implements AnonymousClass33U, AbstractC49292Px, AbstractC63982xK {
    public C59842oN A00;
    public AbstractC49292Px A01;
    public AbstractC03660Hd A02;
    public PickerSearchDialogFragment A03;
    public AnonymousClass33U A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public final C662733o A08;

    public C69873Iw(C662733o r1) {
        this.A08 = r1;
    }

    @Override // X.AbstractC49292Px
    public void AGa(C49262Ps r2) {
        AbstractC49292Px r0 = this.A01;
        if (r0 != null) {
            r0.AGa(r2);
        }
    }

    @Override // X.AbstractC63982xK
    public void AJt(List list) {
        this.A05 = list;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            ((StickerSearchDialogFragment) pickerSearchDialogFragment).A07.A00.A07(list);
        }
    }

    @Override // X.AnonymousClass33U
    public void AKY(C29241Xq r2, Integer num) {
        AnonymousClass33U r0 = this.A04;
        if (r0 != null) {
            r0.AKY(r2, num);
        }
    }
}
