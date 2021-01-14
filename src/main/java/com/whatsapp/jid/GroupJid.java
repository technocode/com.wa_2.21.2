package com.whatsapp.jid;

import X.AnonymousClass02W;
import X.AnonymousClass02Y;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public abstract class GroupJid extends AnonymousClass02W implements Parcelable {
    public GroupJid(Parcel parcel) {
        super(parcel);
    }

    public GroupJid(String str) {
        super(str);
    }

    public static GroupJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof GroupJid) {
                return (GroupJid) jid;
            }
            throw new AnonymousClass02Y(str);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }
}
