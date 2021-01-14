package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.1ZO  reason: invalid class name */
public abstract class AnonymousClass1ZO implements AnonymousClass0TO {
    public int A00 = R.layout.abc_action_menu_item_layout;
    public int A01 = R.layout.abc_action_menu_layout;
    public Context A02;
    public Context A03;
    public LayoutInflater A04;
    public AnonymousClass0T8 A05;
    public AnonymousClass0TR A06;
    public AnonymousClass0TU A07;

    @Override // X.AnonymousClass0TO
    public boolean A2q(AnonymousClass0T8 r2, AnonymousClass1ZT r3) {
        return false;
    }

    @Override // X.AnonymousClass0TO
    public boolean A4B(AnonymousClass0T8 r2, AnonymousClass1ZT r3) {
        return false;
    }

    public AnonymousClass1ZO(Context context) {
        this.A03 = context;
        this.A04 = LayoutInflater.from(context);
    }

    public View A00(AnonymousClass1ZT r5, View view, ViewGroup viewGroup) {
        AbstractC13070jY r6;
        if (view instanceof AbstractC13070jY) {
            r6 = (AbstractC13070jY) view;
        } else {
            r6 = (AbstractC13070jY) this.A04.inflate(this.A00, viewGroup, false);
        }
        AnonymousClass23R r2 = (AnonymousClass23R) this;
        r6.AAn(r5, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) r6;
        actionMenuItemView.A05 = (ActionMenuView) ((AnonymousClass1ZO) r2).A07;
        AnonymousClass1Zb r0 = r2.A07;
        if (r0 == null) {
            r0 = new AnonymousClass1Zb(r2);
            r2.A07 = r0;
        }
        actionMenuItemView.A04 = r0;
        return (View) r6;
    }

    @Override // X.AnonymousClass0TO
    public boolean AKe(AnonymousClass0TY r2) {
        AnonymousClass0TR r0 = this.A06;
        if (r0 != null) {
            return r0.AI7(r2);
        }
        return false;
    }

    @Override // X.AnonymousClass0TO
    public void AO1(AnonymousClass0TR r1) {
        this.A06 = r1;
    }

    @Override // X.AnonymousClass0TO
    public void AQr(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.A07;
        if (viewGroup != null) {
            AnonymousClass0T8 r0 = this.A05;
            if (r0 != null) {
                r0.A05();
                ArrayList A042 = this.A05.A04();
                int size = A042.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass1ZT r9 = (AnonymousClass1ZT) A042.get(i2);
                    if ((r9.A02 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        AnonymousClass1ZT r02 = null;
                        if (childAt instanceof AbstractC13070jY) {
                            r02 = ((AbstractC13070jY) childAt).getItemData();
                        }
                        View A002 = A00(r9, childAt, viewGroup);
                        if (r9 != r02) {
                            A002.setPressed(false);
                            A002.jumpDrawablesToCurrentState();
                        }
                        if (A002 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A002.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A002);
                            }
                            ((ViewGroup) this.A07).addView(A002, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == ((AnonymousClass23R) this).A08) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
    }
}
