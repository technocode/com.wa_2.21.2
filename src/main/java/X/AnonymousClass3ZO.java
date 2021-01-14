package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.3ZO  reason: invalid class name */
public class AnonymousClass3ZO implements AbstractC16260pW {
    public int A00 = -1;
    public final AbstractC16300pa A01;
    public final /* synthetic */ AnonymousClass3ZP A02;

    public AnonymousClass3ZO(AnonymousClass3ZP r2, AbstractC16300pa r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    @Override // X.AbstractC16260pW
    public void ADx(int i, int i2, Object obj) {
        this.A01.A01.A04(i, i2, obj);
    }

    @Override // X.AbstractC16260pW
    public void AGm(int i, int i2) {
        int i3 = this.A00;
        if (i3 == -1 || i3 >= i) {
            this.A00 = i;
            if (i == 0) {
                SearchViewModel searchViewModel = this.A02.A0d;
                if (searchViewModel.A0E.A01() == null || ((Number) searchViewModel.A0E.A01()).intValue() == 0) {
                    searchViewModel.A0Q.A07(0);
                }
            }
        }
        this.A01.A01.A02(i, i2);
    }

    @Override // X.AbstractC16260pW
    public void AHp(int i, int i2) {
        this.A01.A01.A01(i, i2);
    }

    @Override // X.AbstractC16260pW
    public void AJG(int i, int i2) {
        this.A01.A01.A03(i, i2);
    }
}
