with (import <nixpkgs> {});
mkShell {
  buildInputs = [
    gradle
    ripgrep
  ];
}
