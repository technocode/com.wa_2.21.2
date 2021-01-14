package com.whatsapp.core;

import X.AnonymousClass008;
import X.AnonymousClass03P;
import android.telephony.SubscriptionManager;
import android.util.Pair;
import com.whatsapp.util.Log;

public class NetworkStateManager$SubscriptionManagerBasedRoamingDetector {
    public static Pair determineNetworkStateUsingSubscriptionManager(AnonymousClass03P r2, boolean z) {
        if (z) {
            Log.d("app/network-type phone is above api 24");
        }
        SubscriptionManager A0E = r2.A0E();
        if (A0E != null) {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            if (z) {
                AnonymousClass008.A0t("app/network-type default data subscription id is: ", defaultDataSubscriptionId);
            }
            if (defaultDataSubscriptionId != -1) {
                boolean isNetworkRoaming = A0E.isNetworkRoaming(defaultDataSubscriptionId);
                if (z) {
                    AnonymousClass008.A1G("app/network-type isRoaming is: ", isNetworkRoaming);
                }
                Boolean bool = Boolean.TRUE;
                if (isNetworkRoaming) {
                    return new Pair(bool, 3);
                }
                return new Pair(bool, 2);
            }
        }
        return new Pair(Boolean.FALSE, 0);
    }
}
