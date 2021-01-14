package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass0EA;
import X.C001000o;
import X.C001801b;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.util.AbstractCollection;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlDeviceSessionRequirement implements AnonymousClass0EA, Requirement {
    public transient AnonymousClass01I A00;
    public transient C001000o A01;
    public transient AnonymousClass01L A02;
    public final String targetJidRawString;

    public AxolotlDeviceSessionRequirement(DeviceJid deviceJid) {
        this.targetJidRawString = deviceJid.getRawString();
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean ABQ() {
        DeviceJid nullable = DeviceJid.getNullable(this.targetJidRawString);
        if (nullable != null) {
            if (((AbstractCollection) this.A02.A06(nullable.userJid)).contains(nullable)) {
                AnonymousClass01I r0 = this.A00;
                r0.A04();
                if (!nullable.equals(r0.A02)) {
                    return this.A01.A0W(C001801b.A0A(nullable));
                }
            }
            AnonymousClass008.A1V(AnonymousClass008.A0S("AxolotlDeviceSessionRequirement/isPresent/warning: the specific device is not in db, handle the error in the job. jid="), this.targetJidRawString);
            return true;
        }
        throw null;
    }

    @Override // X.AnonymousClass0EA
    public void AO7(Context context) {
        this.A00 = AnonymousClass01I.A00();
        this.A02 = AnonymousClass01L.A00();
        this.A01 = C001000o.A00();
    }
}
