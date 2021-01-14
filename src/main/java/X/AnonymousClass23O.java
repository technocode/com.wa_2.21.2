package X;

import android.view.ActionProvider;

/* renamed from: X.23O  reason: invalid class name */
public class AnonymousClass23O extends AnonymousClass1ZU implements ActionProvider.VisibilityListener {
    public AbstractC14850mz A00;

    public AnonymousClass23O(AnonymousClass1ZW r1, ActionProvider actionProvider) {
        super(r1, actionProvider);
    }

    public void onActionProviderVisibilityChanged(boolean z) {
        AbstractC14850mz r0 = this.A00;
        if (r0 != null) {
            AnonymousClass0T8 r1 = ((AnonymousClass1ZS) r0).A00.A0E;
            r1.A0F = true;
            r1.A0E(true);
        }
    }
}
