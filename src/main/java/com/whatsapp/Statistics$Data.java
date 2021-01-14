package com.whatsapp;

import X.AnonymousClass008;
import java.io.Serializable;

public class Statistics$Data implements Serializable {
    public static final long serialVersionUID = 1;
    public final long last_reset;
    public long rx_google_drive_bytes = 0;
    public long rx_media_bytes = 0;
    public long rx_media_msgs = 0;
    public long rx_message_service_bytes = 0;
    public long rx_offline_delay = 0;
    public long rx_offline_msgs = 0;
    public long rx_payment_msgs = 0;
    public long rx_roaming_bytes = 0;
    public long rx_status_bytes = 0;
    public long rx_statuses = 0;
    public long rx_text_msgs = 0;
    public long rx_voip_bytes = 0;
    public long rx_voip_calls = 0;
    public long tx_google_drive_bytes = 0;
    public long tx_media_bytes = 0;
    public long tx_media_msgs = 0;
    public long tx_message_service_bytes = 0;
    public long tx_payment_msgs = 0;
    public long tx_roaming_bytes = 0;
    public long tx_status_bytes = 0;
    public long tx_statuses = 0;
    public long tx_text_msgs = 0;
    public long tx_voip_bytes = 0;
    public long tx_voip_calls = 0;

    public Statistics$Data(Statistics$Data statistics$Data) {
        this.rx_text_msgs = statistics$Data.rx_text_msgs;
        this.tx_text_msgs = statistics$Data.tx_text_msgs;
        this.rx_media_msgs = statistics$Data.rx_media_msgs;
        this.tx_media_msgs = statistics$Data.tx_media_msgs;
        this.rx_payment_msgs = statistics$Data.rx_payment_msgs;
        this.tx_payment_msgs = statistics$Data.tx_payment_msgs;
        this.rx_statuses = statistics$Data.rx_statuses;
        this.tx_statuses = statistics$Data.tx_statuses;
        this.rx_offline_msgs = statistics$Data.rx_offline_msgs;
        this.rx_offline_delay = statistics$Data.rx_offline_delay;
        this.rx_media_bytes = statistics$Data.rx_media_bytes;
        this.tx_media_bytes = statistics$Data.tx_media_bytes;
        this.rx_message_service_bytes = statistics$Data.rx_message_service_bytes;
        this.tx_message_service_bytes = statistics$Data.tx_message_service_bytes;
        this.rx_status_bytes = statistics$Data.rx_status_bytes;
        this.tx_status_bytes = statistics$Data.tx_status_bytes;
        this.last_reset = statistics$Data.last_reset;
        this.rx_voip_calls = statistics$Data.rx_voip_calls;
        this.tx_voip_calls = statistics$Data.tx_voip_calls;
        this.rx_voip_bytes = statistics$Data.rx_voip_bytes;
        this.tx_voip_bytes = statistics$Data.tx_voip_bytes;
        this.rx_google_drive_bytes = statistics$Data.rx_google_drive_bytes;
        this.tx_google_drive_bytes = statistics$Data.tx_google_drive_bytes;
        this.rx_roaming_bytes = statistics$Data.rx_roaming_bytes;
        this.tx_roaming_bytes = statistics$Data.tx_roaming_bytes;
    }

    public Statistics$Data(boolean z) {
        if (z) {
            this.last_reset = System.currentTimeMillis();
        } else {
            this.last_reset = Long.MIN_VALUE;
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Text Messages: ");
        A0S.append(this.tx_text_msgs);
        A0S.append(" sent, ");
        A0S.append(this.rx_text_msgs);
        A0S.append(" received");
        A0S.append(" / Media Messages: ");
        A0S.append(this.tx_media_msgs);
        A0S.append(" sent (");
        long j = this.tx_media_bytes;
        A0S.append(j);
        A0S.append(" bytes), ");
        A0S.append(this.rx_media_msgs);
        A0S.append(" received (");
        long j2 = this.rx_media_bytes;
        A0S.append(j2);
        A0S.append(" bytes)");
        A0S.append(" / Offline Messages: ");
        A0S.append(this.rx_offline_msgs);
        A0S.append(" received (");
        A0S.append(this.rx_offline_delay);
        A0S.append(" msec average delay)");
        A0S.append(" / Status : ");
        A0S.append(this.tx_statuses);
        A0S.append(" sent (");
        long j3 = this.tx_status_bytes;
        A0S.append(j3);
        A0S.append(" bytes), ");
        A0S.append(this.rx_statuses);
        A0S.append(" received (");
        long j4 = this.rx_status_bytes;
        A0S.append(j4);
        A0S.append(" bytes)");
        A0S.append(" / Payment Messages : ");
        A0S.append(this.tx_payment_msgs);
        A0S.append(" sent, ");
        A0S.append(this.rx_payment_msgs);
        A0S.append(" received");
        A0S.append(" / Message Service: ");
        long j5 = this.tx_message_service_bytes;
        A0S.append(j5);
        A0S.append(" bytes sent, ");
        long j6 = this.rx_message_service_bytes;
        A0S.append(j6);
        A0S.append(" bytes received");
        A0S.append(" / Voip Calls: ");
        A0S.append(this.tx_voip_calls);
        A0S.append(" outgoing calls, ");
        A0S.append(this.rx_voip_calls);
        A0S.append(" incoming calls, ");
        long j7 = this.tx_voip_bytes;
        A0S.append(j7);
        A0S.append(" bytes sent, ");
        long j8 = this.rx_voip_bytes;
        A0S.append(j8);
        A0S.append(" bytes received");
        A0S.append(" / Google Drive: ");
        long j9 = this.tx_google_drive_bytes;
        A0S.append(j9);
        A0S.append(" bytes sent, ");
        long j10 = this.rx_google_drive_bytes;
        A0S.append(j10);
        A0S.append(" bytes received");
        A0S.append(" / Roaming: ");
        A0S.append(this.tx_roaming_bytes);
        A0S.append(" bytes sent, ");
        A0S.append(this.rx_roaming_bytes);
        A0S.append(" bytes received");
        A0S.append(" / Total Data: ");
        A0S.append(j + j5 + j7 + j9 + j3);
        A0S.append(" bytes sent, ");
        A0S.append(j2 + j6 + j8 + j10 + j4);
        A0S.append(" bytes received");
        return A0S.toString();
    }
}
