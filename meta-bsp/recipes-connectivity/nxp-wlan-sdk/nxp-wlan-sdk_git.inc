SUMMARY = "NXP Wi-Fi SDK for module 88w8801/8987/8997/9098 and IW416/612"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=ab04ac0f249af12befccb94447c08b77"

# For Kernel 5.4 and later
SRCBRANCH = "lf-6.6.3_1.0.0-omniserver"
MRVL_SRC ?= "git://github.com/O-Software-Team/mwifiex.git;protocol=https;"
SRC_URI = "${MRVL_SRC};branch=${SRCBRANCH}"
SRCREV = "b072cfeed4758d61518c939f536e16a1094121d0"

S = "${WORKDIR}/git/mxm_wifiex/wlan_src"

EXTRA_OEMAKE = "KERNELDIR=${STAGING_KERNEL_BUILDDIR}"

RDEPENDS:${PN} = "wireless-tools"
