package X;

import com.whatsapp.doodle.ColorPickerComponent;
import com.whatsapp.doodle.ColorPickerView;
import com.whatsapp.doodle.TitleBarComponent;

/* renamed from: X.2c6  reason: invalid class name */
public class AnonymousClass2c6 implements AnonymousClass2MG {
    public final /* synthetic */ ColorPickerComponent A00;
    public final /* synthetic */ TitleBarComponent A01;

    @Override // X.AnonymousClass2MG
    public void AFD() {
    }

    @Override // X.AnonymousClass2MG
    public void AFE() {
    }

    @Override // X.AnonymousClass2MG
    public boolean AK4(AbstractC48582Mw r2, float f, float f2) {
        return false;
    }

    @Override // X.AnonymousClass2MG
    public void AK5(AbstractC48582Mw r1, float f, float f2) {
    }

    public AnonymousClass2c6(TitleBarComponent titleBarComponent, ColorPickerComponent colorPickerComponent) {
        this.A01 = titleBarComponent;
        this.A00 = colorPickerComponent;
    }

    @Override // X.AnonymousClass2MG
    public void AK6(AbstractC48582Mw r6) {
        TitleBarComponent titleBarComponent = this.A01;
        ColorPickerView colorPickerView = this.A00.A06;
        titleBarComponent.A05(colorPickerView.A00, colorPickerView.A03);
        titleBarComponent.A06(colorPickerView.A00, 0);
        titleBarComponent.A06.A00(colorPickerView.A00, 0);
    }
}
