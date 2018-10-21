package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent172
    implements PrybarComponent {

  private RootComponent172 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent172.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent172.class, "root"));
  }

  public RootComponent172 getRoot() {
    return root;
  }

}
