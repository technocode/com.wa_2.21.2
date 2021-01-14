package X;

import java.io.Serializable;

/* renamed from: X.0iB  reason: invalid class name and case insensitive filesystem */
public class C12490iB implements Serializable {
    public static final long serialVersionUID = 1;
    public EnumC12500iC countryCodeSource_ = EnumC12500iC.FROM_NUMBER_WITH_PLUS_SIGN;
    public int countryCode_ = 0;
    public String extension_ = "";
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public boolean italianLeadingZero_ = false;
    public long nationalNumber_ = 0;
    public String preferredDomesticCarrierCode_ = "";
    public String rawInput_ = "";

    public void A00(C12490iB r4) {
        if (r4.hasCountryCode) {
            int i = r4.countryCode_;
            this.hasCountryCode = true;
            this.countryCode_ = i;
        }
        if (r4.hasNationalNumber) {
            long j = r4.nationalNumber_;
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
        }
        if (r4.hasExtension) {
            String str = r4.extension_;
            if (str != null) {
                this.hasExtension = true;
                this.extension_ = str;
            } else {
                throw null;
            }
        }
        if (r4.hasItalianLeadingZero) {
            boolean z = r4.italianLeadingZero_;
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
        }
        if (r4.hasRawInput) {
            String str2 = r4.rawInput_;
            if (str2 != null) {
                this.hasRawInput = true;
                this.rawInput_ = str2;
            } else {
                throw null;
            }
        }
        if (r4.hasCountryCodeSource) {
            EnumC12500iC r0 = r4.countryCodeSource_;
            if (r0 != null) {
                this.hasCountryCodeSource = true;
                this.countryCodeSource_ = r0;
            } else {
                throw null;
            }
        }
        if (r4.hasPreferredDomesticCarrierCode) {
            String str3 = r4.preferredDomesticCarrierCode_;
            if (str3 != null) {
                this.hasPreferredDomesticCarrierCode = true;
                this.preferredDomesticCarrierCode_ = str3;
                return;
            }
            throw null;
        }
    }

    public boolean A01(C12490iB r7) {
        if (r7 == null) {
            return false;
        }
        if (this == r7) {
            return true;
        }
        if (this.countryCode_ == r7.countryCode_ && this.nationalNumber_ == r7.nationalNumber_ && this.extension_.equals(r7.extension_) && this.italianLeadingZero_ == r7.italianLeadingZero_ && this.rawInput_.equals(r7.rawInput_) && this.countryCodeSource_ == r7.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(r7.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == r7.hasPreferredDomesticCarrierCode) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12490iB) && A01((C12490iB) obj);
    }

    public int hashCode() {
        int hashCode = (this.extension_.hashCode() + ((Long.valueOf(this.nationalNumber_).hashCode() + ((this.countryCode_ + 2173) * 53)) * 53)) * 53;
        int i = 1237;
        int i2 = 1237;
        if (this.italianLeadingZero_) {
            i2 = 1231;
        }
        int hashCode2 = this.rawInput_.hashCode();
        int hashCode3 = (this.preferredDomesticCarrierCode_.hashCode() + ((this.countryCodeSource_.hashCode() + ((hashCode2 + ((hashCode + i2) * 53)) * 53)) * 53)) * 53;
        if (this.hasPreferredDomesticCarrierCode) {
            i = 1231;
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Country Code: ");
        A0S.append(this.countryCode_);
        A0S.append(" National Number: ");
        A0S.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            A0S.append(" Leading Zero: true");
        }
        if (this.hasExtension) {
            A0S.append(" Extension: ");
            A0S.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            A0S.append(" Country Code Source: ");
            A0S.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            A0S.append(" Preferred Domestic Carrier Code: ");
            A0S.append(this.preferredDomesticCarrierCode_);
        }
        return A0S.toString();
    }
}
