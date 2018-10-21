package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent934
    implements PrybarComponent {

  private RootComponent934 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent934.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent934.class, "root"));
  }

  public RootComponent934 getRoot() {
    return root;
  }

}
