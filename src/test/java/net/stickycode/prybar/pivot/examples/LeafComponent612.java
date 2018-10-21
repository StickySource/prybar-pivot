package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent612
    implements PrybarComponent {

  private RootComponent612 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent612.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent612.class, "root"));
  }

  public RootComponent612 getRoot() {
    return root;
  }

}
