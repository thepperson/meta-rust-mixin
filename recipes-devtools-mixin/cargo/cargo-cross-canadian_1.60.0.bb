require recipes-devtools-mixin/rust/rust-source.inc
require recipes-devtools-mixin/rust/rust-snapshot.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/cargo-${PV}:"

require cargo-cross-canadian.inc
