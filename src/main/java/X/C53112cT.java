package X;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.search.verification.client.R;

/* renamed from: X.2cT  reason: invalid class name and case insensitive filesystem */
public class C53112cT implements AbstractC48432Mf {
    public final int A00;

    @Override // X.AbstractC48432Mf
    public boolean A2S(boolean z, boolean z2) {
        return !z;
    }

    @Override // X.AbstractC48432Mf
    public int A8W(boolean z) {
        return z ? 1 : 0;
    }

    public C53112cT(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC48432Mf
    public AbstractC48582Mw A3S(Context context, AnonymousClass01X r4, boolean z) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass2cZ();
            case 1:
                return new C53172ce();
            case 2:
                return new C53192cg();
            case 3:
                return new C53242cl();
            case 4:
                return new C53202ch();
            case 5:
                return new C53212ci();
            case 6:
                return new C59452nh(context, r4, z);
            case 7:
                return new C60482pY(context, r4, z);
            case 8:
                return new C60492pZ(context, r4, z, r4.A06(R.string.attach_location));
            default:
                return null;
        }
    }

    @Override // X.AbstractC48432Mf
    public String A5S(AnonymousClass01X r2) {
        int i;
        switch (this.A00) {
            case 0:
                i = R.string.doodle_item_arrow;
                break;
            case 1:
                i = R.string.doodle_item_oval;
                break;
            case 2:
                i = R.string.doodle_item_rectangle;
                break;
            case 3:
                i = R.string.doodle_item_thought_bubble;
                break;
            case 4:
                i = R.string.doodle_item_oval_bubble;
                break;
            case 5:
                i = R.string.doodle_item_rectangular_bubble;
                break;
            case 6:
                i = R.string.doodle_item_digital_clock;
                break;
            case 7:
                i = R.string.doodle_item_analog_clock;
                break;
            case 8:
                i = R.string.doodle_item_location;
                break;
            default:
                i = R.string.emoji_button_description;
                break;
        }
        return r2.A06(i);
    }

    @Override // X.AbstractC48432Mf
    public C03960Il[] A6B() {
        switch (this.A00) {
            case 0:
                return new C03960Il[]{new C03960Il(new int[]{8599})};
            case 1:
                return new C03960Il[]{new C03960Il(new int[]{11093})};
            case 2:
                return new C03960Il[]{new C03960Il(new int[]{128306})};
            case 3:
                return new C03960Il[]{new C03960Il(new int[]{128173})};
            case 4:
            case 5:
                return new C03960Il[]{new C03960Il(new int[]{128172})};
            case 6:
            case 7:
                return new C03960Il[]{new C03960Il(new int[]{128346})};
            case 8:
                return new C03960Il[]{new C03960Il(new int[]{128205})};
            default:
                return AbstractC48432Mf.A00;
        }
    }

    @Override // X.AbstractC48432Mf
    public int A7q(Context context, int i) {
        int i2 = this.A00;
        if (i2 == 6) {
            Resources resources = context.getResources();
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
            }
            return resources.getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
        } else if (i2 == 7 && i == 1) {
            return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_large_clock_grid_padding);
        } else {
            return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding);
        }
    }

    @Override // X.AbstractC48432Mf
    public String A9J() {
        StringBuilder A0S = AnonymousClass008.A0S("custom:");
        A0S.append(this.A00);
        return A0S.toString();
    }

    @Override // X.AbstractC48432Mf
    public boolean AMt() {
        int i = this.A00;
        return i == 7 || i == 8;
    }
}
