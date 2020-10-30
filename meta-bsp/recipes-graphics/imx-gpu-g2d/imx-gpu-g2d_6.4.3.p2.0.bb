require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "6b345a6f58c0a84f9c9df46679d690a1"
SRC_URI[aarch64.sha256sum] = "ada7a78427e8b0bfaa6f223b18f3402df5c65e3ad9f87492182d7d7b1bc8e6c7"
SRC_URI[arm.md5sum] = "ec28fcfd2b25e1826c6bc91eab9cf8b2"
SRC_URI[arm.sha256sum] = "fd393787d2f1efdeaf2ddb6b48f0921b8b7f4dceaf13d893dc4e70396e301678"
