package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0iF  reason: invalid class name and case insensitive filesystem */
public class C12530iF implements Externalizable {
    public static final long serialVersionUID = 1;
    public int countryCode_ = 0;
    public C12550iH emergency_ = null;
    public C12550iH fixedLine_ = null;
    public C12550iH generalDesc_ = null;
    public boolean hasCountryCode;
    public boolean hasEmergency;
    public boolean hasFixedLine;
    public boolean hasGeneralDesc;
    public boolean hasId;
    public boolean hasInternationalPrefix;
    public boolean hasLeadingDigits;
    public boolean hasLeadingZeroPossible;
    public boolean hasMainCountryForCode;
    public boolean hasMobile;
    public boolean hasNationalPrefix;
    public boolean hasNationalPrefixForParsing;
    public boolean hasNationalPrefixTransformRule;
    public boolean hasNoInternationalDialling;
    public boolean hasPager;
    public boolean hasPersonalNumber;
    public boolean hasPreferredExtnPrefix;
    public boolean hasPreferredInternationalPrefix;
    public boolean hasPremiumRate;
    public boolean hasSameMobileAndFixedLinePattern;
    public boolean hasSharedCost;
    public boolean hasTollFree;
    public boolean hasUan;
    public boolean hasVoicemail;
    public boolean hasVoip;
    public String id_ = "";
    public String internationalPrefix_ = "";
    public List intlNumberFormat_ = new ArrayList();
    public String leadingDigits_ = "";
    public boolean leadingZeroPossible_ = false;
    public boolean mainCountryForCode_ = false;
    public C12550iH mobile_ = null;
    public String nationalPrefixForParsing_ = "";
    public String nationalPrefixTransformRule_ = "";
    public String nationalPrefix_ = "";
    public C12550iH noInternationalDialling_ = null;
    public List numberFormat_ = new ArrayList();
    public C12550iH pager_ = null;
    public C12550iH personalNumber_ = null;
    public String preferredExtnPrefix_ = "";
    public String preferredInternationalPrefix_ = "";
    public C12550iH premiumRate_ = null;
    public boolean sameMobileAndFixedLinePattern_ = false;
    public C12550iH sharedCost_ = null;
    public C12550iH tollFree_ = null;
    public C12550iH uan_ = null;
    public C12550iH voicemail_ = null;
    public C12550iH voip_ = null;

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            C12550iH r0 = new C12550iH();
            r0.readExternal(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = r0;
        }
        if (objectInput.readBoolean()) {
            C12550iH r02 = new C12550iH();
            r02.readExternal(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = r02;
        }
        if (objectInput.readBoolean()) {
            C12550iH r03 = new C12550iH();
            r03.readExternal(objectInput);
            this.hasMobile = true;
            this.mobile_ = r03;
        }
        if (objectInput.readBoolean()) {
            C12550iH r04 = new C12550iH();
            r04.readExternal(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = r04;
        }
        if (objectInput.readBoolean()) {
            C12550iH r05 = new C12550iH();
            r05.readExternal(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = r05;
        }
        if (objectInput.readBoolean()) {
            C12550iH r06 = new C12550iH();
            r06.readExternal(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = r06;
        }
        if (objectInput.readBoolean()) {
            C12550iH r07 = new C12550iH();
            r07.readExternal(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = r07;
        }
        if (objectInput.readBoolean()) {
            C12550iH r08 = new C12550iH();
            r08.readExternal(objectInput);
            this.hasVoip = true;
            this.voip_ = r08;
        }
        if (objectInput.readBoolean()) {
            C12550iH r09 = new C12550iH();
            r09.readExternal(objectInput);
            this.hasPager = true;
            this.pager_ = r09;
        }
        if (objectInput.readBoolean()) {
            C12550iH r010 = new C12550iH();
            r010.readExternal(objectInput);
            this.hasUan = true;
            this.uan_ = r010;
        }
        if (objectInput.readBoolean()) {
            C12550iH r011 = new C12550iH();
            r011.readExternal(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = r011;
        }
        if (objectInput.readBoolean()) {
            C12550iH r012 = new C12550iH();
            r012.readExternal(objectInput);
            this.hasEmergency = true;
            this.emergency_ = r012;
        }
        if (objectInput.readBoolean()) {
            C12550iH r013 = new C12550iH();
            r013.readExternal(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = r013;
        }
        String readUTF = objectInput.readUTF();
        this.hasId = true;
        this.id_ = readUTF;
        int readInt = objectInput.readInt();
        this.hasCountryCode = true;
        this.countryCode_ = readInt;
        String readUTF2 = objectInput.readUTF();
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = readUTF2;
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = readUTF5;
        }
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = readUTF6;
        }
        if (objectInput.readBoolean()) {
            String readUTF7 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = readUTF7;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = readBoolean;
        int readInt2 = objectInput.readInt();
        for (int i = 0; i < readInt2; i++) {
            C12540iG r1 = new C12540iG();
            r1.readExternal(objectInput);
            this.numberFormat_.add(r1);
        }
        int readInt3 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt3; i2++) {
            C12540iG r12 = new C12540iG();
            r12.readExternal(objectInput);
            this.intlNumberFormat_.add(r12);
        }
        boolean readBoolean2 = objectInput.readBoolean();
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = readBoolean2;
        if (objectInput.readBoolean()) {
            String readUTF8 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = readUTF8;
        }
        boolean readBoolean3 = objectInput.readBoolean();
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = readBoolean3;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        int size = this.numberFormat_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C12540iG) this.numberFormat_.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.intlNumberFormat_.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((C12540iG) this.intlNumberFormat_.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
    }
}
