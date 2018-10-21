package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent832
    implements PrybarComponent {

  private RootComponent832 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent832.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent832.class, "root"));
  }

  public RootComponent832 getRoot() {
    return root;
  }

}
