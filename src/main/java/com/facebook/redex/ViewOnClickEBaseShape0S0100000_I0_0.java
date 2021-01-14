package com.facebook.redex;

import X.AbstractC06110Rt;
import X.AnonymousClass008;
import X.AnonymousClass00Y;
import X.AnonymousClass037;
import X.AnonymousClass0PW;
import X.AnonymousClass0QH;
import X.AnonymousClass0YP;
import X.AnonymousClass0YW;
import X.AnonymousClass1ZT;
import X.AnonymousClass205;
import X.AnonymousClass2WZ;
import X.AnonymousClass366;
import X.C02780Dk;
import X.C09590dC;
import X.C09600dD;
import X.C29671Zy;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.AcceptInviteLinkActivity;
import com.whatsapp.BusinessAppEducation;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.InsufficientStorageSpaceActivity;
import com.whatsapp.ProfilePhotoReminder;
import com.whatsapp.SetStatus;
import com.whatsapp.Settings;
import com.whatsapp.SettingsChat;
import com.whatsapp.StatusPrivacyActivity;
import com.whatsapp.StatusesFragment;
import com.whatsapp.components.WaSwitchView;
import com.whatsapp.group.NewGroup;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

public class ViewOnClickEBaseShape0S0100000_I0_0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape0S0100000_I0_0(AbstractC06110Rt r2) {
        this.A01 = 0;
        this.A00 = r2;
    }

    public ViewOnClickEBaseShape0S0100000_I0_0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        AnonymousClass1ZT r0;
        switch (this.A01) {
            case 0:
                ((AbstractC06110Rt) this.A00).A00();
                return;
            case 1:
                SearchView searchView = (SearchView) this.A00;
                if (view == searchView.A0h) {
                    searchView.A0G(false);
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                    searchAutoComplete.requestFocus();
                    searchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = searchView.A07;
                    if (onClickListener != null) {
                        onClickListener.onClick(searchView);
                        return;
                    }
                    return;
                } else if (view == searchView.A0e) {
                    searchView.A05();
                    return;
                } else if (view == searchView.A0g) {
                    searchView.A06();
                    return;
                } else if (view == searchView.A0i) {
                    SearchableInfo searchableInfo = searchView.A02;
                    if (searchableInfo != null) {
                        try {
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.A0V);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity == null) {
                                    str4 = null;
                                } else {
                                    str4 = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", str4);
                                searchView.getContext().startActivity(intent);
                                return;
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.A0U;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle bundle = new Bundle();
                                Bundle bundle2 = searchView.A05;
                                if (bundle2 != null) {
                                    bundle.putParcelable("app_data", bundle2);
                                }
                                Intent intent4 = new Intent(intent2);
                                int i = 1;
                                Resources resources = searchView.getResources();
                                if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                    str = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                } else {
                                    str = "free_form";
                                }
                                String str5 = null;
                                if (searchableInfo.getVoicePromptTextId() != 0) {
                                    str2 = resources.getString(searchableInfo.getVoicePromptTextId());
                                } else {
                                    str2 = null;
                                }
                                if (searchableInfo.getVoiceLanguageId() != 0) {
                                    str3 = resources.getString(searchableInfo.getVoiceLanguageId());
                                } else {
                                    str3 = null;
                                }
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i = searchableInfo.getVoiceMaxResults();
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
                                intent4.putExtra("android.speech.extra.PROMPT", str2);
                                intent4.putExtra("android.speech.extra.LANGUAGE", str3);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                                if (searchActivity2 != null) {
                                    str5 = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str5);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                searchView.getContext().startActivity(intent4);
                                return;
                            } else {
                                return;
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (view == searchView.A0k) {
                    searchView.A04();
                    return;
                } else {
                    return;
                }
            case 2:
                C29671Zy r02 = ((Toolbar) this.A00).A0Q;
                if (r02 != null && (r0 = r02.A01) != null) {
                    r0.collapseActionView();
                    return;
                }
                return;
            case 3:
                ((TextInputLayout) this.A00).A0E(false);
                return;
            case 4:
                ((Activity) this.A00).finish();
                return;
            case 5:
                ((AcceptInviteLinkActivity) this.A00).lambda$displayGroupInfo$848$AcceptInviteLinkActivity(view);
                return;
            case 6:
                ((Conversation) this.A00).lambda$onCreate$608$Conversation(view);
                return;
            case 7:
                ((Conversation) this.A00).lambda$onCreate$600$Conversation(view);
                return;
            case 8:
                ((Conversation) this.A00).lambda$new$598$Conversation(view);
                return;
            case 9:
                ((Conversation) this.A00).lambda$onCreate$606$Conversation(view);
                return;
            case 10:
                ((Conversation) this.A00).lambda$onCreate$609$Conversation(view);
                return;
            case 11:
                ((Conversation) this.A00).A1G(false);
                return;
            case 12:
                ((Activity) this.A00).finish();
                return;
            case 13:
                AnonymousClass008.A0n(C09590dC.A0M, "storage_usage_banner_dismissed", true);
                ((C09590dC) this.A00).A02.setVisibility(8);
                return;
            case 14:
                C09590dC r4 = (C09590dC) this.A00;
                AnonymousClass00Y r03 = r4.A0G;
                AnonymousClass205 r1 = new AnonymousClass205();
                r03.A09(r1, 1);
                AnonymousClass00Y.A01(r1, "");
                r4.A03(2);
                AnonymousClass008.A0k(C09590dC.A0M, "education_banner_count", 3);
                NewGroup.A04(C02780Dk.A00(r4.getContext()), 1, null);
                return;
            case 15:
                C09590dC r2 = (C09590dC) this.A00;
                r2.A00.setVisibility(8);
                C09600dD r42 = r2.A0A;
                SharedPreferences sharedPreferences = r42.A00.A00;
                sharedPreferences.edit().putInt("biz_app_cross_sell_banner_dismiss_count", sharedPreferences.getInt("biz_app_cross_sell_banner_dismiss_count", 0) + 1).apply();
                r42.A00(3);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                ((C09590dC) this.A00).A01();
                return;
            case 17:
                Context context = view.getContext();
                context.startActivity(new Intent(context, BusinessAppEducation.class));
                C09600dD r43 = ((C09590dC) this.A00).A0A;
                SharedPreferences sharedPreferences2 = r43.A00.A00;
                sharedPreferences2.edit().putInt("biz_app_cross_sell_banner_click_count", sharedPreferences2.getInt("biz_app_cross_sell_banner_click_count", 0) + 1).apply();
                r43.A00(2);
                return;
            case 18:
                C09590dC r5 = (C09590dC) this.A00;
                AnonymousClass008.A0n(C09590dC.A0M, "storage_usage_banner_dismissed", true);
                r5.A06.A05(r5.getContext(), StorageUsageActivity.A04(r5.getContext(), r5.A04, 3));
                return;
            case 19:
                ((HomeActivity) this.A00).A0l(true);
                return;
            case AnonymousClass0PW.A01:
                ((HomeActivity) this.A00).lambda$initSearchView$1096$HomeActivity(view);
                return;
            case 21:
                ((HomeActivity) this.A00).lambda$onCreate$1088$HomeActivity(view);
                return;
            case 22:
                ((InsufficientStorageSpaceActivity) this.A00).lambda$onCreate$1201$InsufficientStorageSpaceActivity(view);
                return;
            case 23:
                ((InsufficientStorageSpaceActivity) this.A00).lambda$onCreate$1202$InsufficientStorageSpaceActivity(view);
                return;
            case 24:
                ((ProfilePhotoReminder) this.A00).lambda$onCreate$1282$ProfilePhotoReminder(view);
                return;
            case 25:
                ((ProfilePhotoReminder) this.A00).lambda$onCreate$1284$ProfilePhotoReminder(view);
                return;
            case 26:
                ((AnonymousClass0YP) this.A00).A04(true);
                return;
            case 27:
                ((SetStatus) this.A00).A0T();
                return;
            case 28:
                ((Settings) this.A00).lambda$onCreate$1335$Settings(view);
                return;
            case 29:
                ((Settings) this.A00).lambda$onCreate$1336$Settings(view);
                return;
            case 30:
                ((Settings) this.A00).lambda$onCreate$1338$Settings(view);
                return;
            case 31:
                ((SettingsChat) this.A00).lambda$onCreate$1348$SettingsChat(view);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                ((SettingsChat) this.A00).lambda$onCreate$1351$SettingsChat(view);
                return;
            case 33:
                ((SettingsChat) this.A00).lambda$onCreate$1349$SettingsChat(view);
                return;
            case 34:
                ((SettingsChat) this.A00).lambda$onCreate$1352$SettingsChat(view);
                return;
            case 35:
                ((SettingsChat) this.A00).lambda$onCreate$1347$SettingsChat(view);
                return;
            case 36:
                ((SettingsChat) this.A00).lambda$loadLanguagePicker$1355$SettingsChat(view);
                return;
            case 37:
                ((SettingsChat) this.A00).lambda$onCreate$1353$SettingsChat(view);
                return;
            case 38:
                ((SettingsChat) this.A00).lambda$onCreate$1350$SettingsChat(view);
                return;
            case 39:
                ((SettingsChat) this.A00).lambda$onCreate$1346$SettingsChat(view);
                return;
            case 40:
                ((WaSwitchView) this.A00).A00.toggle();
                return;
            case 41:
                StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                AnonymousClass008.A0n(statusesFragment.A0d, "show_statuses_education", false);
                statusesFragment.A02.setVisibility(8);
                return;
            case 42:
                StatusesFragment statusesFragment2 = (StatusesFragment) this.A00;
                statusesFragment2.A0Q.A02(statusesFragment2.A0A(), 12);
                return;
            case 43:
                AnonymousClass037 r3 = (AnonymousClass037) this.A00;
                r3.A0h(new Intent(r3.A00(), StatusPrivacyActivity.class));
                return;
            case 44:
                AnonymousClass0YW r22 = (AnonymousClass0YW) this.A00;
                if (!r22.A0N.ABT() && !r22.A0o.hasMessages(0)) {
                    r22.A0H(r22.A0N.ACP());
                    return;
                }
                return;
            case 45:
                AnonymousClass0YW r44 = (AnonymousClass0YW) this.A00;
                if (!r44.A0i && !r44.A0N.ABT() && !r44.A0o.hasMessages(0)) {
                    r44.A0i = true;
                    r44.A0x.A03 = SystemClock.elapsedRealtime();
                    r44.A0N.ACO();
                    float f = 180.0f;
                    if (r44.A0N.AB5()) {
                        f = -180.0f;
                    }
                    AnonymousClass366 r23 = new AnonymousClass366(f, (float) (r44.A0C.getWidth() >> 1), (float) (r44.A0C.getHeight() >> 1), (float) (-r44.A0C.getWidth()));
                    r23.setDuration(360);
                    r23.setInterpolator(new LinearInterpolator());
                    r23.setAnimationListener(new AnonymousClass2WZ(r44));
                    r44.A0C.startAnimation(r23);
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                ((AnonymousClass0QH) this.A00).lambda$onCreate$968$MultipleContactPicker(view);
                return;
            case 47:
                ((AnonymousClass0QH) this.A00).A0Y();
                return;
            case 48:
                ((AnonymousClass0QH) this.A00).A0Z();
                return;
            case 49:
                ((Runnable) this.A00).run();
                return;
            default:
                return;
        }
    }
}
