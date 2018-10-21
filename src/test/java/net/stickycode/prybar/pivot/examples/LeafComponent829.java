package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent829
    implements PrybarComponent {

  private RootComponent829 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent829.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent829.class, "root"));
  }

  public RootComponent829 getRoot() {
    return root;
  }

}
