package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.0jJ  reason: invalid class name and case insensitive filesystem */
public class C12920jJ extends ActionMode {
    public final Context A00;
    public final AbstractC06110Rt A01;

    public C12920jJ(Context context, AbstractC06110Rt r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public void finish() {
        this.A01.A00();
    }

    public View getCustomView() {
        AbstractC06110Rt r1 = this.A01;
        if (!(r1 instanceof AnonymousClass1ZM)) {
            WeakReference weakReference = ((AnonymousClass0V6) r1).A01;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }
        WeakReference weakReference2 = ((AnonymousClass1ZM) r1).A04;
        if (weakReference2 != null) {
            return (View) weakReference2.get();
        }
        return null;
    }

    public Menu getMenu() {
        AnonymousClass0T8 r1;
        Context context = this.A00;
        AbstractC06110Rt r12 = this.A01;
        if (!(r12 instanceof AnonymousClass1ZM)) {
            r1 = ((AnonymousClass0V6) r12).A03;
        } else {
            r1 = ((AnonymousClass1ZM) r12).A02;
        }
        return new AnonymousClass1ZY(context, r1);
    }

    public MenuInflater getMenuInflater() {
        AbstractC06110Rt r1 = this.A01;
        if (!(r1 instanceof AnonymousClass1ZM)) {
            return new C12950jM(((AnonymousClass0V6) r1).A02);
        }
        return new C12950jM(((AnonymousClass1ZM) r1).A03.getContext());
    }

    public CharSequence getSubtitle() {
        AbstractC06110Rt r1 = this.A01;
        if (!(r1 instanceof AnonymousClass1ZM)) {
            return ((AnonymousClass0V6) r1).A04.A09.A08;
        }
        return ((AnonymousClass1ZM) r1).A03.A08;
    }

    public Object getTag() {
        return this.A01.A00;
    }

    public CharSequence getTitle() {
        AbstractC06110Rt r1 = this.A01;
        if (!(r1 instanceof AnonymousClass1ZM)) {
            return ((AnonymousClass0V6) r1).A04.A09.A09;
        }
        return ((AnonymousClass1ZM) r1).A03.A09;
    }

    public boolean getTitleOptionalHint() {
        return this.A01.A01;
    }

    public void invalidate() {
        this.A01.A01();
    }

    public boolean isTitleOptional() {
        AbstractC06110Rt r1 = this.A01;
        if (r1 instanceof AnonymousClass1ZM) {
            return ((AnonymousClass1ZM) r1).A03.A0A;
        }
        if (!(r1 instanceof AnonymousClass0V6)) {
            return false;
        }
        return ((AnonymousClass0V6) r1).A04.A09.A0A;
    }

    public void setCustomView(View view) {
        this.A01.A02(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        AbstractC06110Rt r2 = this.A01;
        if (!(r2 instanceof AnonymousClass1ZM)) {
            AnonymousClass0V6 r22 = (AnonymousClass0V6) r2;
            r22.A03(r22.A04.A01.getResources().getString(i));
            return;
        }
        AnonymousClass1ZM r23 = (AnonymousClass1ZM) r2;
        r23.A03.setSubtitle(r23.A00.getString(i));
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.A01.A03(charSequence);
    }

    public void setTag(Object obj) {
        this.A01.A00 = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        AbstractC06110Rt r2 = this.A01;
        if (!(r2 instanceof AnonymousClass1ZM)) {
            AnonymousClass0V6 r22 = (AnonymousClass0V6) r2;
            r22.A04(r22.A04.A01.getResources().getString(i));
            return;
        }
        AnonymousClass1ZM r23 = (AnonymousClass1ZM) r2;
        r23.A03.setTitle(r23.A00.getString(i));
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.A01.A04(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        AbstractC06110Rt r1 = this.A01;
        if (r1 instanceof AnonymousClass1ZM) {
            AnonymousClass1ZM r12 = (AnonymousClass1ZM) r1;
            ((AbstractC06110Rt) r12).A01 = z;
            r12.A03.setTitleOptional(z);
        } else if (!(r1 instanceof AnonymousClass0V6)) {
            r1.A01 = z;
        } else {
            AnonymousClass0V6 r13 = (AnonymousClass0V6) r1;
            ((AbstractC06110Rt) r13).A01 = z;
            r13.A04.A09.setTitleOptional(z);
        }
    }
}
