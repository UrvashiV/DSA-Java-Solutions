<h2><a href="https://www.geeksforgeeks.org/problems/stack-permutations/1">Validate Stack Operations</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p data-start="212" data-end="288"><span style="font-size: 14pt;">You have an empty stack and can perform push and pop operations in it. </span></p>
<p data-start="212" data-end="288"><span style="font-size: 14pt;">Given two arrays <strong data-start="237" data-end="244">a[]</strong> and <strong data-start="249" data-end="256">b[] </strong>of unique elements and&nbsp;both having the same length.</span></p>
<p><span style="font-size: 14pt;"> </span></p>
<ul>
<li data-start="292" data-end="365"><span style="font-size: 14pt;">a[] represents the order in which elements are pushed into a stack.</span><span style="font-size: 14pt;"> </span></li>
<li data-start="368" data-end="458"><span style="font-size: 14pt;">b[] represents the order in which elements are expected to be popped from the stack.</span></li>
</ul>
<p><span style="font-size: 14pt;"> </span></p>
<p><span style="font-size: 14pt;"> </span></p>
<p data-start="460" data-end="611"><span style="font-size: 14pt;">Determine whether the given push and pop sequences are <strong>valid</strong>.</span></p>
<p data-start="460" data-end="611"><span style="font-size: 14pt;"><strong>Note:</strong> The stack is empty initially and must also be empty after performing all the operations.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>a[] = [1, 2, 3], b[] = [2, 1, 3]
<strong>Output: </strong>true
<strong>Explanation:<br></strong>Take 1 from a and push it into the stack,
Take 2 from a and push it into the stack,
Take 2 from b and pop it from the stack,<br>Take 1 from b and pop it from the stack,
Take 3 from a and push it into the stack,
Take 3 from b and pop it from the stack<br>So, all the push and pop sequences are valid.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>a[] = [1, 2, 3], b[] = [3, 1, 2]
<strong>Output: </strong>false
<strong>Explanation: </strong>After pushing 1, 2, and 3, we can pop 3 as required. But the next element in b[] is 1, while the stack top is 2. Since 1 is blocked under 2, this order cannot be achieved.<br></span></pre>
<p><span style="font-size: 14pt;"></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>NPCI</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Stack</code>&nbsp;<code>implementation</code>&nbsp;