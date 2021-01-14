package X;

import android.content.ContentValues;

/* renamed from: X.0bL  reason: invalid class name and case insensitive filesystem */
public class C08560bL {
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08 = 1;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D = 1;
    public long A0E = 1;
    public long A0F = 1;
    public long A0G;
    public long A0H;
    public long A0I = 1;
    public long A0J = -1;
    public long A0K;
    public long A0L;
    public C007103l A0M;
    public AbstractC007503q A0N;
    public AbstractC007503q A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AnonymousClass02N A0T;

    public C08560bL(AnonymousClass02N r5) {
        this.A0T = r5;
        this.A0M = new C007103l(0, 0);
    }

    public synchronized ContentValues A00() {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("archived", Boolean.valueOf(this.A0R));
        return contentValues;
    }

    public synchronized ContentValues A01() {
        ContentValues contentValues;
        contentValues = new ContentValues(1);
        contentValues.put("change_number_notified_message_id", Long.valueOf(this.A08));
        return contentValues;
    }

    public synchronized ContentValues A02() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        return contentValues;
    }

    public synchronized ContentValues A03() {
        ContentValues A0B2;
        A0B2 = A0B();
        A0B2.put("last_read_message_table_id", Long.valueOf(this.A0G));
        A0B2.put("last_message_table_id", Long.valueOf(this.A0F));
        A0B2.put("last_important_message_table_id", Long.valueOf(this.A0E));
        return A0B2;
    }

    public synchronized ContentValues A04() {
        ContentValues contentValues;
        contentValues = new ContentValues(4);
        contentValues.put("message_table_id", Long.valueOf(this.A0I));
        contentValues.put("last_message_table_id", Long.valueOf(this.A0F));
        contentValues.put("mod_tag", Integer.valueOf(this.A07));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0K));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A03));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A05));
        return contentValues;
    }

    public synchronized ContentValues A05() {
        ContentValues contentValues;
        contentValues = new ContentValues(7);
        contentValues.put("key_remote_jid", this.A0T.getRawString());
        contentValues.put("subject", this.A0Q);
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A06));
        contentValues.put("change_number_notified_message_id", Long.valueOf(this.A08));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0K));
        contentValues.put("my_messages", (Integer) 1);
        return contentValues;
    }

    public synchronized ContentValues A06() {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0M.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0M.ephemeralSettingTimestamp));
        return contentValues;
    }

    public synchronized ContentValues A07() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("gen", Double.valueOf(this.A00));
        return contentValues;
    }

    public synchronized ContentValues A08() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(this.A0H));
        return contentValues;
    }

    public synchronized ContentValues A09() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        int i = 0;
        if (this.A0S) {
            i = 1;
        }
        contentValues.put("show_group_description", Integer.valueOf(i));
        return contentValues;
    }

    public synchronized ContentValues A0A() {
        ContentValues contentValues;
        contentValues = new ContentValues(1);
        contentValues.put("my_messages", Integer.valueOf(this.A02));
        return contentValues;
    }

    public synchronized ContentValues A0B() {
        ContentValues contentValues;
        contentValues = new ContentValues(4);
        contentValues.put("unseen_message_count", Integer.valueOf(this.A03));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A04));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A05));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0L));
        return contentValues;
    }

    public synchronized ContentValues A0C() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A06));
        return contentValues;
    }

    public synchronized ContentValues A0D() {
        ContentValues contentValues;
        contentValues = new ContentValues(3);
        contentValues.put("mod_tag", Integer.valueOf(this.A07));
        return contentValues;
    }

    public synchronized ContentValues A0E(Long l) {
        ContentValues contentValues;
        contentValues = new ContentValues(3);
        if (l != null) {
            contentValues.put("creation", l);
        }
        contentValues.put("subject", this.A0Q);
        return contentValues;
    }

    public synchronized ContentValues A0F(Long l) {
        ContentValues contentValues;
        contentValues = new ContentValues(22);
        contentValues.put("mod_tag", Integer.valueOf(this.A07));
        contentValues.put("message_table_id", Long.valueOf(this.A0I));
        contentValues.put("last_message_table_id", Long.valueOf(this.A0F));
        contentValues.put("last_read_message_table_id", Long.valueOf(this.A0G));
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(this.A0H));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0L));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A03));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A04));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A05));
        contentValues.put("last_important_message_table_id", Long.valueOf(this.A0E));
        int i = 1;
        int i2 = 0;
        if (this.A0S) {
            i2 = 1;
        }
        contentValues.put("show_group_description", Integer.valueOf(i2));
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0M.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0M.ephemeralSettingTimestamp));
        contentValues.put("gen", Double.valueOf(this.A00));
        contentValues.put("subject", this.A0Q);
        if (!this.A0R) {
            i = 0;
        }
        contentValues.put("archived", Integer.valueOf(i));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0K));
        contentValues.put("change_number_notified_message_id", Long.valueOf(this.A08));
        contentValues.put("my_messages", Integer.valueOf(this.A02));
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A06));
        if (l != null) {
            contentValues.put("creation", l);
        }
        return contentValues;
    }

    public synchronized ContentValues A0G(Long l) {
        ContentValues contentValues;
        contentValues = new ContentValues(23);
        contentValues.put("mod_tag", Integer.valueOf(this.A07));
        contentValues.put("display_message_row_id", Long.valueOf(this.A0I));
        contentValues.put("last_message_row_id", Long.valueOf(this.A0F));
        contentValues.put("last_read_message_row_id", Long.valueOf(this.A0G));
        contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(this.A0H));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0L));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A03));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A04));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A05));
        contentValues.put("last_important_message_row_id", Long.valueOf(this.A0E));
        int i = 1;
        int i2 = 0;
        if (this.A0S) {
            i2 = 1;
        }
        contentValues.put("show_group_description", Integer.valueOf(i2));
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0M.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0M.ephemeralSettingTimestamp));
        contentValues.put("gen", Double.valueOf(this.A00));
        contentValues.put("subject", this.A0Q);
        if (!this.A0R) {
            i = 0;
        }
        contentValues.put("archived", Integer.valueOf(i));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0K));
        contentValues.put("change_number_notified_message_row_id", Long.valueOf(this.A08));
        contentValues.put("spam_detection", Integer.valueOf(this.A02));
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A06));
        if (l != null) {
            contentValues.put("created_timestamp", l);
        }
        return contentValues;
    }

    public synchronized String A0H() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(this.A05);
        sb.append("/");
        sb.append(this.A03);
        sb.append("/");
        sb.append(this.A04);
        sb.append("/");
        sb.append(this.A0L);
        return sb.toString();
    }

    public void A0I() {
        this.A0O = null;
        this.A0N = null;
        this.A0I = 1;
        this.A0F = 1;
        this.A0E = 1;
        this.A0G = 1;
        this.A0H = 1;
        this.A0D = 1;
        A0J(0, 0, 0);
    }

    public synchronized boolean A0J(int i, int i2, int i3) {
        if (this.A03 == i && this.A04 == i2 && this.A05 == i3) {
            return false;
        }
        if (i <= 0) {
            this.A0L = 0;
        }
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        return true;
    }
}
