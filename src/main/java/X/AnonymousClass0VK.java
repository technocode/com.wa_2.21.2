package X;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: X.0VK  reason: invalid class name */
public final class AnonymousClass0VK {
    public int A00;
    public final ColorStateList A01;
    public final Shader A02;

    public AnonymousClass0VK(Shader shader, ColorStateList colorStateList, int i) {
        this.A02 = shader;
        this.A01 = colorStateList;
        this.A00 = i;
    }

    public boolean A00() {
        ColorStateList colorStateList;
        return this.A02 == null && (colorStateList = this.A01) != null && colorStateList.isStateful();
    }
}
