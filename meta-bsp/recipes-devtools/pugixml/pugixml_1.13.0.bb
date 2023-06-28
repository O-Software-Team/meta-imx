SUMMARY = "pugixml is a C++ XML processing library"
HOMEPAGE = "http://pugixml.org/"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f969127d7b7ed0a8a63c2bbeae002588"

SRC_URI = "git://github.com/zeux/pugixml.git;branch=master;protocol=https"

SRCREV = "a0e064336317c9347a91224112af9933598714e9"

S = "${WORKDIR}/git"

inherit cmake

# pugixml generates only a static library, so the main package is empty,
# and the dev package depends on staticdev
ALLOW_EMPTY:${PN} = "1"
RDEPENDS:${PN}-dev = "${PN}-staticdev"

BBCLASSEXTEND = "native nativesdk"
