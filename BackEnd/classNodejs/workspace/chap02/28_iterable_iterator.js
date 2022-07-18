const a = ['apple', 'strawbarry', 'grape', 'pear']
console.log(Symbol.iterator in a);

const it = a[Symbol.iterator]()
console.log(it.next());
console.log(it.next());
console.log(it.next());

for (let i = 0; i < a.length; i++) {
    console.log(it.next());
}
// for (const item of a) console.log(item);

// for (const item in a) console.log(item);
