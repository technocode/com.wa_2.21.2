package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass0EA;
import X.AnonymousClass0EU;
import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class ChatConnectionRequirement implements AnonymousClass0EA, Requirement {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass0EU A00;

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean ABQ() {
        return this.A00.A03();
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass0EU.A03;
    }
}
