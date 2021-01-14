package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.List;

/* renamed from: X.06Z  reason: invalid class name */
public final class AnonymousClass06Z implements AnonymousClass06R {
    public static final int[][] A01 = {new int[0], new int[]{16842908}, new int[]{16842913}, new int[]{16842919}, new int[]{-16842910}};
    public List A00;

    @Override // X.AnonymousClass06R
    public boolean AMv() {
        return false;
    }

    @Override // X.AnonymousClass06R
    public Drawable A3G(AnonymousClass05r r12, AnonymousClass06Q r13) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable[] drawableArr = new Drawable[6];
        for (int i = 0; i < this.A00.size(); i++) {
            C009706a r2 = (C009706a) this.A00.get(i);
            Drawable A3G = r2.A00.A3G(r12, r13);
            String str = r2.A01;
            switch (str.hashCode()) {
                case -691041417:
                    if (str.equals("focused")) {
                        drawableArr[1] = A3G;
                        break;
                    } else {
                        break;
                    }
                case -318264286:
                    if (str.equals("pressed")) {
                        drawableArr[3] = A3G;
                        break;
                    } else {
                        break;
                    }
                case 270940796:
                    if (str.equals("disabled")) {
                        drawableArr[4] = A3G;
                        break;
                    } else {
                        break;
                    }
                case 1191572123:
                    if (str.equals("selected")) {
                        drawableArr[2] = A3G;
                        break;
                    } else {
                        break;
                    }
                case 1544803905:
                    if (str.equals("default")) {
                        drawableArr[0] = A3G;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int i2 = 5;
        do {
            if (drawableArr[i2] != null) {
                stateListDrawable.addState(A01[i2], drawableArr[i2]);
            }
            i2--;
        } while (i2 >= 0);
        return stateListDrawable;
    }
}
