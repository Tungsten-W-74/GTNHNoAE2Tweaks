# GTNH No-AE2 challenge tweaks

I made this GTNH add-on to help facilitate my 2.8.4 No-AE2 challenge run

# Features
Every change is independently configurable, e.g. if you want to still use AE2 but also want AAL Linked Input Bus support

- Functionally disable AE2 networks
- EOH no longer requires an ME output bus or ME hatch, and can have unlimited output hatches.
- Gorge no longer requires an ME output bus
- Added input separation toggle to Industrial Press, Precise Assembler, and Zyngen multiblocks.
- Added recipe lock toggle to many multiblocks.
- Made Linked Input Bus compatible with Assembly Line and AAL
  - ~~I believe this to be a bug not intentional, since for LIB the circuit slot is slot 0 rather than the last slot like the rest of the input bus types, and so it's submitted to the recipe instead of the bus contents.~~
  - Apparently this is a bug-turned-feature as some devs years ago believed this to be too OP... apparently matter manipulating 256 ae2-enabled UAALs is not too OP in comparison.
- Slapshod infinite output hatch intended for EOH with AAs. Requires MHDCSM + fluid singularity cell to craft.

Be very careful turning input separation off with the PRASS because it's a lag monster. If you do turn it off, try to limit yourself to 1 recipe per PRASS, and restrict your input bus sizes where reasonable.

# TODO
- ~~Multi-slot infinite output hatch for EOH, and re-instating the 1-output hatch restriction (no cheaping out on expensive casing)~~ P.I.T.A, not doing this
